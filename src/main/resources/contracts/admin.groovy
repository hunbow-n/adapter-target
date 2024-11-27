package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Проверка метода hello"
    request {
        method GET()
        urlPath '/admin/hello'
    }
    response {
        status OK()
        body "hello to you"
        headers {
            contentType(textPlain())
        }
    }
}