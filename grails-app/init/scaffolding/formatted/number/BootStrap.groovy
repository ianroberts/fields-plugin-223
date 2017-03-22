package scaffolding.formatted.number

import example.BigNumbers

class BootStrap {

    def init = { servletContext ->
      new BigNumbers(firstNumber:50, secondNumber:12000).save(flush:true, failOnError:true)
    }
    def destroy = {
    }
}
