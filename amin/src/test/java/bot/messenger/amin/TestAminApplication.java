package bot.messenger.amin;

import org.springframework.boot.SpringApplication;

public class TestAminApplication {

	public static void main(String[] args) {
		SpringApplication.from(AminApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
