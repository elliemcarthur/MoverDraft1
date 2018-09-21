package springwork.controller.models;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import springwork.controller.dao.UserDAO;
import springwork.controller.dao.UserDAOI;

@Configuration
public class AppConfig {

  @Bean
  public UserDAOI jdbcPersonDao() {
      return new UserDAO();
  }

  @Bean
  public DataSource h2DataSource() {
      return new EmbeddedDatabaseBuilder()
              .setType(EmbeddedDatabaseType.H2)
              .addScript("createReguser.sql")
              .build();
  }
}