package priv.gitonlie.flowable;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import priv.gitonlie.flowable.process.Demo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootFlowableApplicationTests {

	@Autowired
	private Demo demo;
	@Autowired
	SqlSession sqlSession;
	@Test
	public void contextLoads() {
//		demo.startUp();
//		demo.completeTask("2505", "小明");
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("assignee", "dasdasd");
		map.put("actId", "startevent1");
		sqlSession.update("updateAct",map);
	}

}
