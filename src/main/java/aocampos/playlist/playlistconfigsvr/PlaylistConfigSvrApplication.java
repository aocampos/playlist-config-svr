package aocampos.playlist.playlistconfigsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PlaylistConfigSvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistConfigSvrApplication.class, args);
	}
}
