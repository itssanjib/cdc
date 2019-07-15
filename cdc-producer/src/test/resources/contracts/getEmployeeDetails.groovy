org.springframework.cloud.contract.spec.Contract.make {
	description 'This is producer contract for get employee details.'
	
	priority 1
	
	request {
		method 'GET'
		url '/employee/123'
		headers{
			header('Content-Type', 'application/json;charset=UTF-8')
		}
	}
	
	response{
		status 200
		body("""
		{
			"id":"0001",
			"name":"Sanjib Pal",
			"age":38
		}
		""")
		headers{
			header('Content-Type': 'application/json;charset=UTF-8')
		}
	}
}