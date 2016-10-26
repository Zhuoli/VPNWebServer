package vpnwebserver

import java.time.LocalDateTime;

class  ListProjectsController {


    def index() {
        redirect (action: "current")
    }

    def current = {
        def projectName = "Project Name tutorial"
        def dueDate = LocalDateTime.now().toString()
        [project:projectName, date:dueDate]
    }

    def overdue = {
        render "Hello world"
    }
}
