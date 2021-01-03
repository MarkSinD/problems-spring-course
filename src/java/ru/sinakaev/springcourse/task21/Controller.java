package ru.sinakaev.springcourse.task21;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/box")
public class Controller {
    @RequestMapping("/boxForm")
    public String showForm(Model theModel) {
        Box box = new Box();
        LinkedHashMap<String, Pen> pens = new LinkedHashMap<>();

        Pen penMap1 = new Pen();
        penMap1.setName("RedName");

        Pen penMap2 = new Pen();
        penMap2.setName("BlackName");

        Pen penMap3 = new Pen();
        penMap3.setName("WhiteName");

        Pen penMap4 = new Pen();
        penMap4.setName("BlueName");

        pens.put("RedMapView", penMap1);
        pens.put( "BlackMapView", penMap2);
        pens.put( "WhiteMapView", penMap3);
        pens.put( "BlueMapView", penMap4);

        List<Pen> penList = new ArrayList<>();

        Pen penList1 = new Pen();
        penList1.setName("RedListName");

        Pen penList2 = new Pen();
        penList2.setName("BlackListName");

        Pen penList3 = new Pen();
        penList3.setName("WhiteListName");

        penList.add(penList1);
        penList.add(penList2);
        penList.add(penList3);

        LinkedHashMap<String, String> words = new LinkedHashMap<>();
        words.put( "1", "1");
        words.put( "2", "2");
        words.put( "3", "3");
        words.put( "4", "4");


        theModel.addAttribute("box", box);
        theModel.addAttribute("pens", pens);
        theModel.addAttribute("words", words);
        theModel.addAttribute("penList", penList);


        System.out.println("Data to JSP.");
        System.out.println(pens);
        System.out.println(penList);
        return "box-form";
    }
    @RequestMapping("/processBox")
    public String showResult(@ModelAttribute("box")Box box, @ModelAttribute("string")String string) {
        System.out.println("************");
        System.out.println(box.getPen1());


        System.out.println("************");
        System.out.println(box.getPen2());

        System.out.println("************");
        System.out.println(box.getString());
        return "list";
    }
}
