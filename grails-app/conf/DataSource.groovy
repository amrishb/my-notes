environments {
    development {
        dataSource {
            dbCreate = "update"
            url="jdbc:sqlserver://192.168.1.7:1433;databaseName=notes;integratedSecurity=false;applicationName=my-notes"
            username = "affiservUser"
            password = "affinnova"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:mem:testDb"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:file:prodDb;shutdown=true"
        }
    }
}
