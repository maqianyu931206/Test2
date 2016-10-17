package com.maqianyu.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView showImg;
    private String url = "http://image.baidu.com/search/detail?ct=503316480&z=0" +
            "&ipn=d&word=搞笑狗头图片&step_word=&hs=0&pn=3&spn=0&di=202832485020&pi=0&rn=1" +
            "&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1838753126%2C2053290814&os=2359464787%2C2435277527&simid=0%2C0&adpicid=0&ln=1983&fr=&fmq=1476686487465_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fg.hiphotos.baidu.com%2Fzhidao%2Fwh%3D450%2C600%2Fsign%3Dcdafbdff8b1001e94e691c0b8d3e57da%2F279759ee3d6d55fbdc9882306b224f4a20a4dd4e.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fzit1w5_z%26e3Bkwt17_z" +
            "%26e3Bv54AzdH3Fq7jfpt5gAzdH3Fcc9an9cn0a9lcm08nd_z%26e3Bip4s&gsm=0&rpstart=0&rpnum=0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s  =  "sssssss";
        showImg = (ImageView) findViewById(R.id.show_img);
        Picasso.with(this).load(url).into(showImg);
    }
}
