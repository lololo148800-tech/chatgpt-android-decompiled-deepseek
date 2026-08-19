package p1044uj;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.statsig.androidsdk.ErrorBoundaryKt;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p021Aj.C0536u;
import p021Aj.ViewOnClickListenerC0529n;
import p025An.C0644w;
import p084D4.AbstractC1893Q;
import p084D4.AbstractC1906c;
import p084D4.C1894S;
import p084D4.C1938s;
import p1039ud.C20198o;
import p1065vj.C20631c;
import p1110xk.AbstractC21282e;
import p1110xk.AbstractC21295r;
import p1112xm.AbstractC21304h;
import p117Eb.C2391u;
import p523V9.AbstractC8048a6;
import p571X9.AbstractC9215U;
import p571X9.AbstractC9345p3;
import p720e6.C13288c;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17656A;
import p909nm.C17692z;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: uj.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C20368x implements InterfaceC14170l {

    /* JADX INFO: renamed from: b */
    public static final C0536u f64391b = new C0536u(6);

    /* JADX INFO: renamed from: a */
    public final C20631c f64392a;

    public C20368x(C20631c binding) {
        AbstractC16544l.m18094g(binding, "binding");
        this.f64392a = binding;
        CoordinatorLayout coordinatorLayout = binding.f65478a;
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        AbstractC18223d.m19731a(coordinatorLayout, 15);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        C20305G c20305g;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle disclaimerStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        Integer headerButtonColorValue;
        Integer backgroundColorValue;
        AbstractC20303E c20301c;
        C20323Z rendering = (C20323Z) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        C20631c c20631c = this.f64392a;
        c20631c.f65484g.setText(rendering.f64239c);
        TextView textView = c20631c.f65479b;
        CoordinatorLayout coordinatorLayout = c20631c.f65478a;
        String str = rendering.f64240d;
        if (str != null) {
            C2391u c2391uM3502t = C2391u.m3502t(coordinatorLayout.getContext());
            c2391uM3502t.m3510G(textView, c2391uM3502t.m3511H(str));
        }
        TextView textView2 = c20631c.f65480c;
        textView2.setText(rendering.f64241e);
        RecyclerView recyclerView = c20631c.f65482e;
        AbstractC1893Q adapter = recyclerView.getAdapter();
        StepStyles.DocumentStepStyle documentStepStyle = rendering.f64258v;
        if (adapter == null) {
            Context context = coordinatorLayout.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            c20305g = new C20305G(context, rendering.f64238b, rendering.f64248l, documentStepStyle);
            recyclerView.setAdapter(c20305g);
        } else {
            AbstractC1893Q adapter2 = recyclerView.getAdapter();
            AbstractC16544l.m18092e(adapter2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter");
            c20305g = (C20305G) adapter2;
        }
        boolean z6 = !rendering.f64253q && rendering.f64254r;
        List documents = rendering.f64243g;
        AbstractC16544l.m18094g(documents, "documents");
        ArrayList arrayList = new ArrayList();
        for (Iterator it = documents.iterator(); it.hasNext(); it = it) {
            AbstractC20340i abstractC20340i = (AbstractC20340i) it.next();
            if (abstractC20340i instanceof C20336g) {
                C20336g c20336g = (C20336g) abstractC20340i;
                File file = new File(c20336g.f64301Y);
                c20301c = new C20300B(file, c20336g, MimeTypeMap.getSingleton().getMimeTypeFromExtension(AbstractC21304h.m21642e(file)));
            } else {
                if (!(abstractC20340i instanceof C20338h)) {
                    throw new C0644w();
                }
                C20338h c20338h = (C20338h) abstractC20340i;
                c20301c = new C20301C(c20338h.f64308o0, c20338h.f64307Z, c20338h, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(c20338h.f64308o0)));
            }
            arrayList.add(c20301c);
        }
        arrayList.add(new C20299A(z6));
        ?? r6 = c20305g.f64191h;
        C1938s c1938sM3016c = AbstractC1906c.m3016c(new C20304F(r6, arrayList));
        c20305g.f64191h = arrayList;
        c1938sM3016c.m3111a(new C13288c(c20305g));
        Iterable iterable = (Iterable) r6;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(iterable, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj2 : iterable) {
            linkedHashMap.put(obj2, (AbstractC20303E) obj2);
        }
        Iterator it2 = AbstractC17680n.m19332I0(arrayList).iterator();
        while (true) {
            C17656A c17656a = (C17656A) it2;
            if (!c17656a.f56445Z.hasNext()) {
                break;
            }
            C17692z c17692z = (C17692z) c17656a.next();
            AbstractC20303E abstractC20303E = (AbstractC20303E) c17692z.f56484b;
            AbstractC20303E abstractC20303E2 = (AbstractC20303E) linkedHashMap.get(abstractC20303E);
            if ((abstractC20303E2 instanceof C20300B) && (abstractC20303E instanceof C20300B)) {
                int i10 = ((C20300B) abstractC20303E2).f64179b.f64303o0;
                int i11 = ((C20300B) abstractC20303E).f64179b.f64303o0;
                if (i10 != i11) {
                    C1894S c1894s = c20305g.f5529a;
                    int i12 = c17692z.f56483a;
                    if (i11 == 100) {
                        c1894s.m2906d(i12, null, 1);
                    } else {
                        c1894s.m2906d(i12, C17296C.f55119a, 1);
                    }
                }
            }
        }
        c20305g.f64192i = new C20198o(rendering, 1);
        Button button = c20631c.f65483f;
        button.setText(rendering.f64242f);
        button.setEnabled(rendering.f64255s);
        button.setOnClickListener(new ViewOnClickListenerC0529n(rendering, 10));
        C20367w c20367w = new C20367w(rendering, 0);
        C20367w c20367w2 = new C20367w(rendering, 1);
        Pi2NavigationBar pi2NavigationBar = c20631c.f65481d;
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        AbstractC9215U.m9783a(rendering.f64244h, c20367w, c20367w2, pi2NavigationBar, coordinatorLayout);
        AbstractC8048a6.m8439c(coordinatorLayout, rendering.f64256t, rendering.f64257u, button, 4, ErrorBoundaryKt.SAMPLING_RATE);
        if (documentStepStyle != null && (backgroundColorValue = documentStepStyle.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            coordinatorLayout.setBackgroundColor(iIntValue);
            AbstractC9345p3.m9937a(viewEnvironment, iIntValue);
        }
        if (documentStepStyle != null) {
            Context context2 = coordinatorLayout.getContext();
            AbstractC16544l.m18093f(context2, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = documentStepStyle.backgroundImageDrawable(context2);
            if (drawableBackgroundImageDrawable != null) {
                coordinatorLayout.setBackground(drawableBackgroundImageDrawable);
            }
        }
        if (documentStepStyle != null && (headerButtonColorValue = documentStepStyle.getHeaderButtonColorValue()) != null) {
            pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
        }
        if (documentStepStyle != null && (titleStyleValue = documentStepStyle.getTitleStyleValue()) != null) {
            AbstractC21295r.m21637c(c20631c.f65484g, titleStyleValue);
        }
        if (documentStepStyle != null && (textStyleValue = documentStepStyle.getTextStyleValue()) != null) {
            AbstractC21295r.m21637c(textView, textStyleValue);
        }
        if (documentStepStyle != null && (disclaimerStyleValue = documentStepStyle.getDisclaimerStyleValue()) != null) {
            AbstractC21295r.m21637c(textView2, disclaimerStyleValue);
        }
        if (documentStepStyle == null || (buttonPrimaryStyleValue = documentStepStyle.getButtonPrimaryStyleValue()) == null) {
            return;
        }
        AbstractC21282e.m21624c(button, buttonPrimaryStyleValue, false, 6);
    }
}
