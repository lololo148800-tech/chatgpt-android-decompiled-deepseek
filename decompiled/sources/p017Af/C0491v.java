package p017Af;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1155zi.C21936L0;
import p1155zi.C22011h0;
import p1155zi.C22020j1;
import p156G1.AbstractC2973t;
import p156G1.C2958e;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p225Im.InterfaceC3776x;
import p318Mh.C5381U;
import p318Mh.C5387a;
import p318Mh.C5398f0;
import p318Mh.C5412m0;
import p318Mh.C5416o0;
import p318Mh.C5428u0;
import p318Mh.C5431w;
import p318Mh.C5433x;
import p318Mh.C5438z0;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p544W9.AbstractC8681n4;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9119D4;
import p857kl.C16447N;
import p988rc.C18919g;

/* JADX INFO: renamed from: Af.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C0491v extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1602Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f1603Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0491v(String str, int i10) {
        super(1);
        this.f1602Y = i10;
        this.f1603Z = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        String str = this.f1603Z;
        switch (this.f1602Y) {
            case 0:
                InterfaceC7537b interfaceC7537b = (InterfaceC7537b) obj;
                AbstractC16544l.m18094g(interfaceC7537b, "$this$null");
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(interfaceC7537b.mo7869t0(AbstractC9119D4.m9650c(16)));
                int iM3195i = AbstractC2119a.m3195i(textPaint.measureText(str));
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                int i10 = 0;
                for (int i11 = 0; i11 < str.length(); i11++) {
                    if (str.charAt(i11) == '\n') {
                        i10++;
                    }
                }
                return new C7545j(AbstractC9113C4.m9643a(iM3195i, (i10 + 1) * ((int) ((-fontMetrics.ascent) + fontMetrics.descent + fontMetrics.leading))));
            case 1:
                Context context = (Context) obj;
                AbstractC16544l.m18094g(context, "context");
                C0455B c0455b = new C0455B(context);
                c0455b.getSettings().setJavaScriptEnabled(true);
                c0455b.loadUrl("https://www.youtube.com/embed/" + str);
                return c0455b;
            case 2:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{str, "textdocs"});
                return c17296c;
            case 3:
                C16447N url2 = (C16447N) obj;
                AbstractC16544l.m18094g(url2, "$this$url");
                AbstractC8681n4.m9374c(url2, new String[]{"gen_title", str});
                return c17296c;
            case 4:
                C16447N url3 = (C16447N) obj;
                AbstractC16544l.m18094g(url3, "$this$url");
                AbstractC8681n4.m9374c(url3, new String[]{str});
                return c17296c;
            case 5:
                C16447N url4 = (C16447N) obj;
                AbstractC16544l.m18094g(url4, "$this$url");
                AbstractC8681n4.m9374c(url4, new String[]{str, "experimental", "generate_suggestions"});
                return c17296c;
            case 6:
                C16447N url5 = (C16447N) obj;
                AbstractC16544l.m18094g(url5, "$this$url");
                AbstractC8681n4.m9374c(url5, new String[]{str});
                return c17296c;
            case 7:
                C16447N url6 = (C16447N) obj;
                AbstractC16544l.m18094g(url6, "$this$url");
                AbstractC8681n4.m9374c(url6, new String[]{str});
                return c17296c;
            case 8:
                C16447N url7 = (C16447N) obj;
                AbstractC16544l.m18094g(url7, "$this$url");
                AbstractC8681n4.m9374c(url7, new String[]{str});
                return c17296c;
            case 9:
                C16447N url8 = (C16447N) obj;
                AbstractC16544l.m18094g(url8, "$this$url");
                AbstractC8681n4.m9374c(url8, new String[]{str});
                return c17296c;
            case 10:
                C16447N url9 = (C16447N) obj;
                AbstractC16544l.m18094g(url9, "$this$url");
                AbstractC8681n4.m9374c(url9, new String[]{str});
                return c17296c;
            case 11:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                return str;
            case 12:
                C18919g withGrayLinkFormat = (C18919g) obj;
                AbstractC16544l.m18094g(withGrayLinkFormat, "$this$withGrayLinkFormat");
                withGrayLinkFormat.m20269a(str);
                return c17296c;
            case 13:
                AbstractC2973t.m3811f((C2963j) obj, str);
                return c17296c;
            case 14:
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                C2974u c2974u = C2971r.f8918d;
                InterfaceC3776x interfaceC3776x = AbstractC2973t.f8942a[2];
                c2974u.m3814a((C2963j) obj, str);
                return c17296c;
            case 15:
                AbstractC2973t.m3811f((C2963j) obj, str);
                return c17296c;
            case 16:
                C2963j c2963j = (C2963j) obj;
                AbstractC2973t.m3811f(c2963j, str);
                AbstractC2973t.m3812g(c2963j, 5);
                return c17296c;
            case 17:
                C2963j c2963j2 = (C2963j) obj;
                InterfaceC3776x[] interfaceC3776xArr2 = AbstractC2973t.f8942a;
                C2974u c2974u2 = C2971r.f8918d;
                InterfaceC3776x[] interfaceC3776xArr3 = AbstractC2973t.f8942a;
                InterfaceC3776x interfaceC3776x2 = interfaceC3776xArr3[2];
                c2974u2.m3814a(c2963j2, str);
                C2974u c2974u3 = C2971r.f8928n;
                InterfaceC3776x interfaceC3776x3 = interfaceC3776xArr3[9];
                c2974u3.m3814a(c2963j2, Float.valueOf(0.0f));
                return c17296c;
            case 18:
                C2963j c2963j3 = (C2963j) obj;
                InterfaceC3776x[] interfaceC3776xArr4 = AbstractC2973t.f8942a;
                C2974u c2974u4 = C2971r.f8924j;
                InterfaceC3776x[] interfaceC3776xArr5 = AbstractC2973t.f8942a;
                InterfaceC3776x interfaceC3776x4 = interfaceC3776xArr5[3];
                c2974u4.m3814a(c2963j3, new C2958e(1));
                C2974u c2974u5 = C2971r.f8918d;
                InterfaceC3776x interfaceC3776x5 = interfaceC3776xArr5[2];
                c2974u5.m3814a(c2963j3, str);
                return c17296c;
            case 19:
                InterfaceC3776x[] interfaceC3776xArr6 = AbstractC2973t.f8942a;
                ((C2963j) obj).m3787m(C2971r.f8911D, str);
                return c17296c;
            case 20:
                C5387a buildRoute = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute, "$this$buildRoute");
                C5431w.f17746g.getClass();
                buildRoute.m5900a(C5431w.f17747h, new C22011h0(str));
                buildRoute.m5900a(C5431w.f17749j, new C22011h0(str));
                return c17296c;
            case 21:
                C5387a buildRoute2 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute2, "$this$buildRoute");
                C5431w.f17746g.getClass();
                buildRoute2.m5900a(C5431w.f17753n, new C22020j1(str));
                return c17296c;
            case 22:
                C5387a buildRoute3 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute3, "$this$buildRoute");
                C5431w.f17746g.getClass();
                buildRoute3.m5900a(C5431w.f17747h, new C22011h0(str));
                buildRoute3.m5900a(C5431w.f17749j, new C22011h0(str));
                buildRoute3.m5900a(C5431w.f17755p, Boolean.TRUE);
                return c17296c;
            case 23:
                C5387a buildRoute4 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute4, "$this$buildRoute");
                C5433x.f17766g.getClass();
                buildRoute4.m5900a(C5433x.f17767h, new C22011h0(str));
                return c17296c;
            case 24:
                C5387a buildRoute5 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute5, "$this$buildRoute");
                C5381U.f17633g.getClass();
                buildRoute5.m5900a(C5381U.f17634h, new C22011h0(str));
                return c17296c;
            case 25:
                C5387a buildRoute6 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute6, "$this$buildRoute");
                C5398f0.f17661h.getClass();
                buildRoute6.m5900a(C5398f0.f17662i, str);
                return c17296c;
            case 26:
                C5387a buildRoute7 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute7, "$this$buildRoute");
                C5412m0.f17690g.getClass();
                buildRoute7.m5900a(C5412m0.f17691h, new C22011h0(str));
                return c17296c;
            case 27:
                C5387a buildRoute8 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute8, "$this$buildRoute");
                C5416o0.f17699g.getClass();
                buildRoute8.m5900a(C5416o0.f17700h, new C21936L0(str));
                return c17296c;
            case 28:
                C5387a buildRoute9 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute9, "$this$buildRoute");
                C5428u0.f17738g.getClass();
                buildRoute9.m5900a(C5428u0.f17739h, str);
                return c17296c;
            default:
                C5387a buildRoute10 = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute10, "$this$buildRoute");
                C5438z0.f17777g.getClass();
                buildRoute10.m5900a(C5438z0.f17778h, new C22011h0(str));
                return c17296c;
        }
    }
}
