package p002A0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Process;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.openai.chatgpt.R;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.openai.feature.serverstatus.impl.sunset.SunsetViewModel;
import com.openai.feature.serverstatus.impl.unsupportedcountry.UnsupportedCountryViewModel;
import com.openai.voice.assistant.AssistantActivity;
import com.withpersona.sdk2.inquiry.steps.p688ui.view.SignatureView;
import gd.C13934f;
import gd.C13969n2;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import livekit.org.webrtc.PeerConnectionFactory;
import mm.C17296C;
import mm.C17309l;
import p003A1.C0275o0;
import p003A1.C0278p0;
import p009A7.C0393c;
import p015Ad.AbstractC0434i;
import p025An.AbstractC0575H;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p038Ba.AbstractC0865o;
import p040Bd.C1032Y1;
import p046Bk.C1338M;
import p046Bk.C1407s0;
import p049Bm.InterfaceC1426a;
import p051Bo.AbstractC1456b;
import p051Bo.C1460f;
import p051Bo.C1461g;
import p054C0.C1502o;
import p054C0.C1505r;
import p069Cf.C1642a;
import p069Cf.C1643b;
import p069Cf.C1644c;
import p071Ch.C1673d;
import p071Ch.C1674e;
import p071Ch.C1675f;
import p071Ch.C1676g;
import p073Cj.C1715c;
import p074Ck.C1717b;
import p097Dh.C2051d;
import p099Dj.C2065c;
import p1061vb.C20513d;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1140z1.AbstractC21690f;
import p1143z4.C21795y;
import p1145z7.InterfaceC21808e;
import p122Eg.C2432a;
import p124Ei.C2532n1;
import p132F2.C2643g;
import p148Fi.C2764G;
import p148Fi.C2862x0;
import p157G2.C2981g;
import p165G9.C3024j;
import p170Gg.C3055c;
import p193Hf.C3324O0;
import p193Hf.C3337V0;
import p193Hf.C3355d;
import p193Hf.C3373j;
import p193Hf.C3418y0;
import p253K.AbstractC4502m;
import p432Rh.C6895h;
import p492U1.C7545j;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8682o;
import p571X9.AbstractC9123E2;
import p571X9.AbstractC9306j0;
import p759g1.C13800b;
import p773h0.C14322z0;
import p849k7.C16354g;
import p909nm.AbstractC17680n;
import p972qm.C18777j;

/* JADX INFO: renamed from: A0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0130g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f543Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f544Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0130g(Object obj, int i10) {
        super(0);
        this.f543Y = i10;
        this.f544Z = obj;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int iM21684R;
        C17309l c17309l;
        C17309l c17309l2;
        String str;
        C1032Y1 c1032y1;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f544Z;
        switch (this.f543Y) {
            case 0:
                C0134k c0134k = (C0134k) obj;
                return new C13800b((c0134k.f557E0 || ((EnumC0137n) c0134k.f555C0.f514p.getValue()) == EnumC0137n.f572Z) ? AbstractC4502m.m5242e(c0134k.f554B0, c0134k.f555C0, c0134k.f556D0, ((C7545j) c0134k.f558F0.getValue()).f23903a) : 9205357640488583168L);
            case 1:
                AbstractC0575H.m1180i(((C0275o0) obj).f1001o0, null);
                return c17296c;
            case 2:
                ((C0278p0) obj).f1008b = null;
                return c17296c;
            case 3:
                ((C21795y) obj).m12196p();
                return c17296c;
            case 4:
                return AbstractC10763a.m11048f(((C0393c) obj).f1310o0.f45313a, "BackPressuredBlockingQueue reached capacity:");
            case 5:
                return "Dropped scheduled item in LoggingScheduledThreadPoolExecutor queue: " + ((Runnable) obj);
            case 6:
                return Long.valueOf(((C3024j) ((InterfaceC21808e) obj)).f9112Z >= 24 ? System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime()) : C16354g.f50792m);
            case 7:
                ((InterfaceC1426a) ((C16525B) obj).f51262Y).invoke();
                return c17296c;
            case 8:
                C1338M c1338m = (C1338M) obj;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(c1338m.f3533a.getContext());
                ViewGroup viewGroup = c1338m.f3533a;
                View viewInflate = layoutInflaterFrom.inflate(R.layout.pi2_signature_bottom_sheet, viewGroup, false);
                viewGroup.addView(viewInflate);
                int i10 = R.id.clear_button;
                Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.clear_button);
                if (button != null) {
                    i10 = R.id.close_signature_sheet_button;
                    ImageView imageView = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.close_signature_sheet_button);
                    if (imageView != null) {
                        i10 = R.id.flow_layout;
                        if (((Flow) AbstractC9123E2.m9654b(viewInflate, R.id.flow_layout)) != null) {
                            i10 = R.id.save_button;
                            Button button2 = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.save_button);
                            if (button2 != null) {
                                i10 = R.id.shadow;
                                View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.shadow);
                                if (viewM9654b != null) {
                                    i10 = R.id.signature_canvas;
                                    SignatureView signatureView = (SignatureView) AbstractC9123E2.m9654b(viewInflate, R.id.signature_canvas);
                                    if (signatureView != null) {
                                        i10 = R.id.signature_description;
                                        TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.signature_description);
                                        if (textView != null) {
                                            i10 = R.id.signature_label;
                                            TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.signature_label);
                                            if (textView2 != null) {
                                                i10 = R.id.signature_sheet;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.signature_sheet);
                                                if (constraintLayout != null) {
                                                    return new C1717b((FrameLayout) viewInflate, button, imageView, button2, viewM9654b, signatureView, textView, textView2, constraintLayout);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
            case 9:
                ((C1407s0) obj).f3756g.invoke();
                return c17296c;
            case 10:
                C1461g c1461g = (C1461g) obj;
                ClassLoader classLoader = c1461g.f3842c;
                Enumeration<URL> resources = classLoader.getResources("");
                AbstractC16544l.m18093f(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                AbstractC16544l.m18093f(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    AbstractC0682p abstractC0682p = c1461g.f3843d;
                    if (!zHasNext) {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        AbstractC16544l.m18093f(resources2, "getResources(...)");
                        ArrayList<URL> list2 = Collections.list(resources2);
                        AbstractC16544l.m18093f(list2, "list(...)");
                        ArrayList arrayList2 = new ArrayList();
                        for (URL url : list2) {
                            AbstractC16544l.m18091d(url);
                            String string = url.toString();
                            AbstractC16544l.m18093f(string, "toString(...)");
                            if (AbstractC21329w.m21734u(string, "jar:file:", false) && (iM21684R = AbstractC21322p.m21684R(string, 0, 6, "!")) != -1) {
                                String str2 = C0654C.f1910Z;
                                String strSubstring = string.substring(4, iM21684R);
                                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                                c17309l = new C17309l(AbstractC1456b.m2065e(C20513d.m21170o(new File(URI.create(strSubstring))), abstractC0682p, C1460f.f3838Z), C1461g.f3841f);
                            } else {
                                c17309l = null;
                            }
                            if (c17309l != null) {
                                arrayList2.add(c17309l);
                            }
                        }
                        return AbstractC17680n.m19361k0(arrayList2, arrayList);
                    }
                    URL url2 = (URL) it.next();
                    AbstractC16544l.m18091d(url2);
                    if (AbstractC16544l.m18089b(url2.getProtocol(), "file")) {
                        String str3 = C0654C.f1910Z;
                        c17309l2 = new C17309l(abstractC0682p, C20513d.m21170o(new File(url2.toURI())));
                    } else {
                        c17309l2 = null;
                    }
                    if (c17309l2 != null) {
                        arrayList.add(c17309l2);
                    }
                }
                break;
            case 11:
                C1502o c1502o = (C1502o) obj;
                c1502o.f4000P0 = null;
                AbstractC21690f.m22211p(c1502o);
                AbstractC21690f.m22210o(c1502o);
                AbstractC21690f.m22209n(c1502o);
                return Boolean.TRUE;
            case 12:
                C1505r c1505r = (C1505r) obj;
                c1505r.f4018K0 = null;
                AbstractC21690f.m22211p(c1505r);
                AbstractC21690f.m22210o(c1505r);
                AbstractC21690f.m22209n(c1505r);
                return Boolean.TRUE;
            case 13:
                C1644c c1644c = (C1644c) obj;
                AbstractC0575H.m1156D(c1644c.m10935y0(), null, null, new C1642a(c1644c, ((C14322z0) c1644c.f4656z0.getValue()).mo5257c() ? 0.1f : 0.0f, null), 3);
                AbstractC0575H.m1156D(c1644c.m10935y0(), null, null, new C1643b(c1644c, ((C14322z0) c1644c.f4656z0.getValue()).mo5258d() ? 0.8f : 0.0f, null), 3);
                return c17296c;
            case 14:
                C1676g c1676g = (C1676g) obj;
                C1673d c1673d = new C1673d(c1676g, null);
                C18777j c18777j = C18777j.f59682Y;
                CharSequence charSequence = (CharSequence) AbstractC0575H.m1161I(c18777j, c1673d);
                int length = charSequence.length();
                Object obj2 = charSequence;
                if (length == 0) {
                    String str4 = (String) AbstractC0575H.m1161I(c18777j, new C1675f(c1676g, null));
                    if (str4 == null || str4.length() == 0) {
                        String string2 = UUID.randomUUID().toString();
                        AbstractC8160o6.m8728c(c1676g.f4754d, AbstractC9306j0.m9889h("Generated new device UUID: ", string2), null, null, 6);
                        str = string2;
                    } else {
                        AbstractC8160o6.m8728c(c1676g.f4754d, "Migrated device UUID: ".concat(str4), null, null, 6);
                        str = str4;
                    }
                    AbstractC16544l.m18091d(str);
                    AbstractC0575H.m1156D(c1676g.f4753c, null, null, new C1674e(c1676g, str, null), 3);
                    obj2 = str;
                }
                return (String) obj2;
            case 15:
                C1715c c1715c = (C1715c) obj;
                c1715c.f4903c = false;
                c1715c.m2513a();
                return c17296c;
            case 16:
                C2065c c2065c = (C2065c) obj;
                BottomSheetBehavior bottomSheetBehaviorM13584v = BottomSheetBehavior.m13584v(c2065c.f6317c);
                AbstractC16544l.m18093f(bottomSheetBehaviorM13584v, "from(...)");
                bottomSheetBehaviorM13584v.m13586A(5);
                FrameLayout frameLayout = c2065c.f6315a;
                AbstractC16544l.m18093f(frameLayout, "getRoot(...)");
                AbstractC8682o.m9380c(null, frameLayout);
                return c17296c;
            case 17:
                return (C6895h) ((C2051d) obj).f6272a.get();
            case 18:
                return ((AbstractC0865o) obj).m1931d();
            case 19:
                ((SunsetViewModel) obj).m14395k(C2432a.f7561a);
                return c17296c;
            case 20:
                return Integer.valueOf(((C2532n1) obj).f7876H.size());
            case 21:
                ((C2643g) obj).m3624a(new C2981g("Your device doesn't support credential manager"));
                return c17296c;
            case 22:
                return (String) ((C13969n2) obj).m15477a(C13934f.f43984d);
            case 23:
                C2862x0 c2862x0 = ((C2764G) obj).f8469a;
                if (c2862x0 == null || (c1032y1 = c2862x0.f8633b) == null) {
                    return null;
                }
                return AbstractC0434i.m1091c(c1032y1, c2862x0.f8632a, null);
            case 24:
                ((PeerConnectionFactory) obj).dispose();
                return c17296c;
            case 25:
                ((UnsupportedCountryViewModel) obj).m14395k(C3055c.f9217a);
                return c17296c;
            case 26:
                ((CanmoreViewModel) obj).m14395k(new C3355d(C3373j.INSTANCE));
                return c17296c;
            case 27:
                return Boolean.valueOf(((Number) ((C3418y0) obj).f10408a.m15224e()).floatValue() == 1.0f);
            case 28:
                return (C3324O0) ((C3337V0) obj).f10189a.getValue();
            default:
                ((AssistantActivity) obj).finish();
                return c17296c;
        }
    }
}
