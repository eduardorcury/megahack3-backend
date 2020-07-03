package time43.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors
					.basePackage("time43.resources"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo("Backend da aplicação Alaobá",
				"API desenvolvida na MegaHack 3, pelo time 43", "Versão 1.0",
				"https://docs.google.com/document/d/1OJeWz8YFEzQYXooFSHxwHbyVSp2cuj8XM1-ODlZUB2Q/edit",
				new Contact("Eduardo Ribeiro Cury", "https://github.com/eduardorcury/megahack3-backend", "eduardoribeirocury@gmail.com"),
				"Todos os direitos aos desenvolvedores", "https://docs.google.com/document/d/1OJeWz8YFEzQYXooFSHxwHbyVSp2cuj8XM1-ODlZUB2Q/edit", Collections.emptyList() // Vendor
																										// Extensions
		);
	}
}
