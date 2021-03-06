modules = {
	mobile {
		defaultBundle 'shopl'

		dependsOn 'jquery'
		dependsOn 'angular'

		resource url: 'css/bootstrap/bootstrap-responsive.css'
		resource url: 'css/bootstrap/bootstrap.css'
		resource url: 'css/mobile.css'

		resource url: 'js/lib/bootstrap/bootstrap.js'
		resource url: 'js/app/app.js'
		resource url: 'js/app/controllers.js'
		resource url: 'js/app/services.js'
	}
}
