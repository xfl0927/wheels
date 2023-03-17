package org.wheels.core;


import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.config.ConfigureBuilder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public void shouldAnswerWithTrue() {

    }

    public static void main(String[] args) throws IOException {
        Map<String,Object> data = new HashMap<>();
        data.put("area","循化县");
        data.put("planType","详细规划");
        data.put("name","循化县详细规划");
        data.put("code","9012");
        data.put("preparedBy","循环县国土资源局");
        data.put("reportBy","huangWl");
        List<Tables> tablesList = new ArrayList<>();
        Tables tables1 = new Tables();
        tables1.setGroup("1");
        tables1.setItem("项目1");
        tables1.setPoint("要点1");
        tables1.setAudit("审查结果1");
        tables1.setRemark("标注1");
        tablesList.add(tables1);
        Tables tables2 = new Tables();
        tables2.setGroup("2");
        tables2.setItem("项目2");
        tables2.setPoint("要点2");
        tables2.setAudit("审查结果2");
        tables2.setRemark("标注2");
        tablesList.add(tables2);
        data.put("tables",tablesList);
        ConfigureBuilder builder = Configure.builder();
        builder.useSpringEL();
        XWPFTemplate render = XWPFTemplate.compile("D:\\code\\wheels\\wheels-core\\src\\main\\resources\\国土空间总体规划审查报告.docx", builder.build()).render(data);
        render.writeAndClose(new FileOutputStream("D:\\code\\wheels\\wheels-core\\src\\main\\resources\\output.docx"));
    }

    public static class Tables {
        private String group;
        private String item;
        private String point;
        private String audit;
        private String remark;

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public String getPoint() {
            return point;
        }

        public void setPoint(String point) {
            this.point = point;
        }

        public String getAudit() {
            return audit;
        }

        public void setAudit(String audit) {
            this.audit = audit;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
