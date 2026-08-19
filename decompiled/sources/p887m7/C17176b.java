package p887m7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.C10846a;
import androidx.compose.p650ui.graphics.vector.VectorPainter;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.openai.feature.jawbone.tools.JawboneToolViewModel;
import com.openai.feature.reporting.ReportingViewModel;
import fo.C13711h;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import mo.C17347n;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p026Ao.InterfaceC0677k;
import p049Bm.InterfaceC1426a;
import p1001s1.C19434d;
import p1001s1.C19437g;
import p1020t7.C19803a;
import p1020t7.C19805c;
import p1029u0.C20092c;
import p102Dm.AbstractC2119a;
import p1035u7.RunnableC20147e;
import p1035u7.RunnableC20148f;
import p1044uj.C20322Y;
import p1059v8.C20477a;
import p1071w0.C20706E0;
import p1071w0.C20750g0;
import p1075w5.C20835m;
import p1098x5.C21129h;
import p1098x5.EnumC21128g;
import p110E4.C2307e;
import p1113xn.AbstractC21322p;
import p1124ya.C21394b;
import p1140z1.AbstractC21690f;
import p1145z7.InterfaceC21804a;
import p1146z8.C21814a;
import p204I1.C3590f;
import p310M9.C5311e;
import p321Mk.C5466d;
import p349O0.C5996c0;
import p355O7.C6141c;
import p499U9.AbstractC7589s;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8206u4;
import p536W.C8408d;
import p562X0.InterfaceC9016k;
import p571X9.AbstractC9123E2;
import p615Z6.C10194T;
import p615Z6.C10235r;
import p615Z6.C10252z0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p747fb.InterfaceFutureC13608b;
import p765g7.InterfaceC13823a;
import p822j2.C16047d;
import p858ko.C16482A;
import p860l0.EnumC16673F0;
import p891mf.C17242c;
import p899n5.C17489f;
import p899n5.C17503t;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p943p7.C18304b;
import p953q0.C18548F;
import p953q0.C18583h0;
import p959q8.C18643e;
import p974qo.C18795k;
import p984r8.C18890d;
import p993rj.C19024D;
import p993rj.C19064z;
import p994rk.C19232x;
import pk.C18504i;
import sg.C19551O;
import uk.C20371a;

/* JADX INFO: renamed from: m7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17176b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54866Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f54867Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17176b(Object obj, int i10) {
        super(0);
        this.f54866Y = i10;
        this.f54867Z = obj;
    }

    /* JADX WARN: Code duplicated, block: B:223:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01be  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dd A[LOOP:0: B:57:0x01bc->B:61:0x01dd, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v32, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        float fWidth;
        float fHeight;
        int i10;
        int i11;
        float fMax;
        File[] fileArrM8826h;
        int i12;
        int i13 = 26;
        String string = null;
        z = false;
        z = false;
        z = false;
        boolean z6 = false;
        switch (this.f54866Y) {
            case 0:
                String property = System.getProperty("http.agent");
                C10252z0 c10252z0 = (C10252z0) this.f54867Z;
                c10252z0.getClass();
                if (property != null) {
                    StringBuilder sb2 = new StringBuilder();
                    int length = property.length();
                    for (int i14 = 0; i14 < length; i14++) {
                        char cCharAt = property.charAt(i14);
                        if (cCharAt == '\t' || (' ' <= cCharAt && cCharAt < 127)) {
                            sb2.append(cCharAt);
                        }
                    }
                    string = sb2.toString();
                    AbstractC16544l.m18093f(string, "toString(...)");
                }
                if (string == null) {
                    string = "";
                }
                if (!AbstractC21322p.m21681O(string)) {
                    return string;
                }
                InterfaceC21804a interfaceC21804a = (InterfaceC21804a) c10252z0.f30458q0;
                String strMo6206l = interfaceC21804a.mo6206l();
                String strMo6205j = interfaceC21804a.mo6205j();
                String strMo6203g = interfaceC21804a.mo6203g();
                StringBuilder sb3 = new StringBuilder("Datadog/");
                AbstractC10763a.m11067y(sb3, (String) c10252z0.f30457p0, " (Linux; U; Android ", strMo6206l, "; ");
                sb3.append(strMo6205j);
                sb3.append(" Build/");
                sb3.append(strMo6203g);
                sb3.append(Separators.RPAREN);
                return sb3.toString();
            case 1:
                ((JawboneToolViewModel) this.f54867Z).m14395k(C17242c.f55020a);
                return C17296C.f55119a;
            case 2:
                VectorPainter vectorPainter = (VectorPainter) this.f54867Z;
                int i15 = vectorPainter.f32733x0;
                C5996c0 c5996c0 = vectorPainter.f32730u0;
                if (i15 == c5996c0.m6412g()) {
                    c5996c0.m6413h(c5996c0.m6412g() + 1);
                }
                return C17296C.f55119a;
            case 3:
                C17503t c17503t = (C17503t) this.f54867Z;
                InterfaceC0677k interfaceC0677kMo19197O0 = c17503t.f55981a.mo19197O0();
                try {
                    C13711h c13711hM15180u = C13711h.m15180u(interfaceC0677kMo19197O0.mo1349T0());
                    AbstractC7942M5.m8232a(interfaceC0677kMo19197O0, null);
                    RectF rectFM15199q = c13711hM15180u.m15199q();
                    if (c17503t.f55983c && rectFM15199q != null) {
                        fWidth = rectFM15199q.width();
                        fHeight = rectFM15199q.height();
                    } else {
                        if (((C10194T) c13711hM15180u.f43259Z) == null) {
                            throw new IllegalArgumentException("SVG document is empty");
                        }
                        fWidth = c13711hM15180u.m15198o().f30392d;
                        if (((C10194T) c13711hM15180u.f43259Z) == null) {
                            throw new IllegalArgumentException("SVG document is empty");
                        }
                        fHeight = c13711hM15180u.m15198o().f30393e;
                    }
                    C20835m c20835m = c17503t.f55982b;
                    EnumC21128g enumC21128g = c20835m.f66242e;
                    C21129h c21129h = C21129h.f67131c;
                    C21129h c21129h2 = c20835m.f66241d;
                    C17309l c17309l = AbstractC16544l.m18089b(c21129h2, c21129h) ? new C17309l(Float.valueOf(fWidth > 0.0f ? fWidth : 512.0f), Float.valueOf(fHeight > 0.0f ? fHeight : 512.0f)) : new C17309l(Float.valueOf(AbstractC7589s.m7932g(c21129h2.f67132a, enumC21128g)), Float.valueOf(AbstractC7589s.m7932g(c21129h2.f67133b, enumC21128g)));
                    float fFloatValue = ((Number) c17309l.f55136Y).floatValue();
                    float fFloatValue2 = ((Number) c17309l.f55137Z).floatValue();
                    if (fWidth <= 0.0f || fHeight <= 0.0f) {
                        int iM3195i = AbstractC2119a.m3195i(fFloatValue);
                        int iM3195i2 = AbstractC2119a.m3195i(fFloatValue2);
                        i10 = iM3195i;
                        i11 = iM3195i2;
                    } else {
                        float f10 = fFloatValue / fWidth;
                        float f11 = fFloatValue2 / fHeight;
                        int iOrdinal = c20835m.f66242e.ordinal();
                        if (iOrdinal == 0) {
                            fMax = Math.max(f10, f11);
                        } else {
                            if (iOrdinal != 1) {
                                throw new C0644w();
                            }
                            fMax = Math.min(f10, f11);
                        }
                        i10 = (int) (fMax * fWidth);
                        i11 = (int) (fMax * fHeight);
                    }
                    if (rectFM15199q == null && fWidth > 0.0f && fHeight > 0.0f) {
                        C10194T c10194t = (C10194T) c13711hM15180u.f43259Z;
                        if (c10194t == null) {
                            throw new IllegalArgumentException("SVG document is empty");
                        }
                        c10194t.f30328o = new C10235r(0.0f, 0.0f, fWidth, fHeight);
                    }
                    C10194T c10194t2 = (C10194T) c13711hM15180u.f43259Z;
                    if (c10194t2 == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    c10194t2.f30297r = C6141c.m6695t("100%");
                    C10194T c10194t3 = (C10194T) c13711hM15180u.f43259Z;
                    if (c10194t3 == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    c10194t3.f30298s = C6141c.m6695t("100%");
                    Bitmap.Config config = c20835m.f66239b;
                    if (config == null || (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE)) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
                    AbstractC16544l.m18093f(bitmapCreateBitmap, "createBitmap(width, height, config)");
                    if (c20835m.f66249l.f66254Y.get("coil#css") != null) {
                        throw new ClassCastException();
                    }
                    c13711hM15180u.m15181B(new Canvas(bitmapCreateBitmap), null);
                    return new C17489f(new BitmapDrawable(c20835m.f66238a.getResources(), bitmapCreateBitmap), true);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(interfaceC0677kMo19197O0, th2);
                        throw th3;
                    }
                }
            case 4:
                return (C8408d) ((InterfaceFutureC13608b) this.f54867Z).get();
            case 5:
                ((C18504i) this.f54867Z).f58969o0.invoke();
                return C17296C.f55119a;
            case 6:
                ((C5311e) this.f54867Z).m5867w();
                return C17296C.f55119a;
            case 7:
                C18548F c18548f = ((C10846a) this.f54867Z).f32542j;
                if (c18548f != null) {
                    AbstractC21690f.m22209n(c18548f);
                }
                return C17296C.f55119a;
            case 8:
                return (C5466d) this.f54867Z;
            case 9:
                return new C18583h0((InterfaceC9016k) this.f54867Z, C17690x.f56481Y);
            case 10:
                InterfaceC13823a interfaceC13823a = ((C18643e) this.f54867Z).f59383Y;
                if (interfaceC13823a != null) {
                    return interfaceC13823a.mo15454j("rum-activity-tracking");
                }
                AbstractC16544l.m18103p("sdkCore");
                throw null;
            case 11:
                C17347n c17347n = ((C18795k) this.f54867Z).f59742e;
                AbstractC16544l.m18091d(c17347n);
                List<Certificate> listM19011a = c17347n.m19011a();
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19011a, 10));
                for (Certificate certificate : listM19011a) {
                    AbstractC16544l.m18092e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 12:
                return String.format(Locale.US, "Already seen telemetry event with identity=%s, rejecting.", Arrays.copyOf(new Object[]{(C18890d) this.f54867Z}, 1));
            case 13:
                if (((C19024D) this.f54867Z).f60635t) {
                    C19024D c19024d = (C19024D) this.f54867Z;
                    AbstractC0575H.m1156D(c19024d.f60624i, null, null, new C19064z(c19024d, null), 3);
                }
                return C17296C.f55119a;
            case 14:
                C21394b c21394b = (C21394b) this.f54867Z;
                ViewGroup.LayoutParams layoutParams = c21394b.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                C16047d c16047d = (C16047d) layoutParams;
                c16047d.f49507E = 1.0f;
                ((ViewGroup.MarginLayoutParams) c16047d).width = -2;
                ((ViewGroup.MarginLayoutParams) c16047d).height = -2;
                c21394b.setLayoutParams(c16047d);
                return C17296C.f55119a;
            case 15:
                return Pattern.compile("-?[0-9]*+((\\.[0-9]{0," + ((C19232x) this.f54867Z).f60980a + "})?)||(\\.)?");
            case 16:
                ((EditText) this.f54867Z).requestFocus();
                return C17296C.f55119a;
            case 17:
                return ((C19434d) this.f54867Z).f61625c;
            case 18:
                return ((C19437g) this.f54867Z).m20515K0();
            case 19:
                ((ReportingViewModel) this.f54867Z).m14395k(C19551O.f62103a);
                return C17296C.f55119a;
            case 20:
                return (Float) this.f54867Z;
            case 21:
                C20092c c20092c = (C20092c) this.f54867Z;
                c20092c.f63619U0.invoke(Boolean.valueOf(!c20092c.f63618T0));
                return C17296C.f55119a;
            case 22:
                RunnableC20147e runnableC20147e = (RunnableC20147e) this.f54867Z;
                C19805c c19805c = runnableC20147e.f63822o0;
                File srcDir = runnableC20147e.f63820Y;
                AbstractC16544l.m18094g(srcDir, "srcDir");
                File destDir = runnableC20147e.f63821Z;
                AbstractC16544l.m18094g(destDir, "destDir");
                InterfaceC11256c interfaceC11256c = c19805c.f62836a;
                boolean zM8824f = AbstractC8206u4.m8824f(srcDir, interfaceC11256c);
                EnumC11255b enumC11255b = EnumC11255b.f34099Z;
                if (zM8824f) {
                    Boolean bool = Boolean.FALSE;
                    C19803a c19803a = C19803a.f62830r0;
                    boolean zBooleanValue = ((Boolean) AbstractC8206u4.m8829k(srcDir, bool, interfaceC11256c, c19803a)).booleanValue();
                    EnumC11255b enumC11255b2 = EnumC11255b.f34100o0;
                    if (!zBooleanValue) {
                        AbstractC7889G0.m8185c(c19805c.f62836a, 5, AbstractC17681o.m19382k(enumC11255b, enumC11255b2), new C18304b(srcDir, 8), null, 56);
                    } else if (AbstractC8206u4.m8824f(destDir, interfaceC11256c)) {
                        if (((Boolean) AbstractC8206u4.m8829k(destDir, bool, interfaceC11256c, c19803a)).booleanValue()) {
                            fileArrM8826h = AbstractC8206u4.m8826h(srcDir, interfaceC11256c);
                            if (fileArrM8826h == null) {
                                fileArrM8826h = new File[0];
                            }
                            for (File file : fileArrM8826h) {
                                if (!((Boolean) AbstractC8206u4.m8829k(file, Boolean.FALSE, interfaceC11256c, new C16482A(new File(destDir, file.getName()), i13))).booleanValue()) {
                                }
                            }
                        } else {
                            AbstractC7889G0.m8185c(c19805c.f62836a, 5, AbstractC17681o.m19382k(enumC11255b, enumC11255b2), new C18304b(destDir, 10), null, 56);
                        }
                    } else if (AbstractC8206u4.m8827i(destDir, interfaceC11256c)) {
                        fileArrM8826h = AbstractC8206u4.m8826h(srcDir, interfaceC11256c);
                        if (fileArrM8826h == null) {
                            fileArrM8826h = new File[0];
                        }
                        while (i12 < r3) {
                            if (!((Boolean) AbstractC8206u4.m8829k(file, Boolean.FALSE, interfaceC11256c, new C16482A(new File(destDir, file.getName()), i13))).booleanValue()) {
                            }
                        }
                    } else {
                        AbstractC7889G0.m8185c(c19805c.f62836a, 5, AbstractC17681o.m19382k(enumC11255b, enumC11255b2), new C18304b(srcDir, 9), null, 56);
                    }
                    return Boolean.valueOf(z6);
                }
                AbstractC7889G0.m8184b(c19805c.f62836a, 3, enumC11255b, new C18304b(srcDir, 7), null, false, 56);
                z6 = true;
                return Boolean.valueOf(z6);
            case 23:
                RunnableC20148f runnableC20148f = (RunnableC20148f) this.f54867Z;
                return Boolean.valueOf(runnableC20148f.f63826Z.m20763a(runnableC20148f.f63825Y));
            case 24:
                ((C20322Y) this.f54867Z).f64234d.invoke();
                return C17296C.f55119a;
            case 25:
                return new C21814a(((C20477a) this.f54867Z).f65000Y.mo15463s());
            case 26:
                C2307e c2307e = (C2307e) this.f54867Z;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(((ViewGroup) c2307e.f7159o0).getContext());
                ViewGroup viewGroup = (ViewGroup) c2307e.f7159o0;
                View viewInflate = layoutInflaterFrom.inflate(R.layout.pi2_input_select_bottom_sheet, viewGroup, false);
                viewGroup.addView(viewInflate);
                int i16 = R.id.bottom_sheet;
                FrameLayout frameLayout = (FrameLayout) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_sheet);
                if (frameLayout != null) {
                    i16 = R.id.list_content;
                    LinearLayout linearLayout = (LinearLayout) AbstractC9123E2.m9654b(viewInflate, R.id.list_content);
                    if (linearLayout != null) {
                        i16 = R.id.list_content_separator;
                        View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.list_content_separator);
                        if (viewM9654b != null) {
                            i16 = R.id.recyclerview_inquiry_select_list;
                            RecyclerView recyclerView = (RecyclerView) AbstractC9123E2.m9654b(viewInflate, R.id.recyclerview_inquiry_select_list);
                            if (recyclerView != null) {
                                i16 = R.id.search_bar_edit_text;
                                TextInputEditText textInputEditText = (TextInputEditText) AbstractC9123E2.m9654b(viewInflate, R.id.search_bar_edit_text);
                                if (textInputEditText != null) {
                                    i16 = R.id.search_bar_text_input;
                                    TextInputLayout textInputLayout = (TextInputLayout) AbstractC9123E2.m9654b(viewInflate, R.id.search_bar_text_input);
                                    if (textInputLayout != null) {
                                        i16 = R.id.shadow;
                                        View viewM9654b2 = AbstractC9123E2.m9654b(viewInflate, R.id.shadow);
                                        if (viewM9654b2 != null) {
                                            i16 = R.id.textview_input_select_sheet_title;
                                            TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_input_select_sheet_title);
                                            if (textView != null) {
                                                i16 = R.id.top_app_bar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) AbstractC9123E2.m9654b(viewInflate, R.id.top_app_bar);
                                                if (materialToolbar != null) {
                                                    return new C20371a((FrameLayout) viewInflate, frameLayout, linearLayout, viewM9654b, recyclerView, textInputEditText, textInputLayout, viewM9654b2, textView, materialToolbar);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i16)));
            case 27:
                return (C3590f) this.f54867Z;
            case 28:
                return ((C20750g0) this.f54867Z).m21294d();
            default:
                return new C20706E0((EnumC16673F0) this.f54867Z, 0.0f);
        }
    }
}
