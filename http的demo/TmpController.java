package archives.web.controller.reports;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @author lyuchao
 * @Description: 这个是 四个请求方式的小demo
 */
@RestController
@RequestMapping("/lyc")
public class TmpController {

	@DeleteMapping("/one")
	public String testOne(@RequestParam String id){
		System.out.println("id= "+id);
		return  JSON.toJSONString("this is delete request");
	}
	
	@PutMapping("/two")
	public String testTwo(@RequestParam String id){
		System.out.println("id= "+id);
		return JSON.toJSONString("this is put request");
	}
	
	@GetMapping("/three")
	public String testThree(@RequestParam String id){
		System.out.println("id= "+id);
		return JSON.toJSONString("this is get request");
	}
	
	@PostMapping("/four")
	public String testFour(@RequestBody String id){
		System.out.println("id= "+id);
		return JSON.toJSONString("this is post request");
	}
}
