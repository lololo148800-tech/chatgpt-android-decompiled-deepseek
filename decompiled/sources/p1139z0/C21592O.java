package p1139z0;

import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p1027tp.AbstractC20064h;
import p371P1.C6305a;
import p371P1.C6306b;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: z0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C21592O {

    /* JADX INFO: renamed from: a */
    public static final C21592O f68385a = new C21592O();

    /* JADX INFO: renamed from: a */
    public final void m21937a(EditorInfo editorInfo, C6306b c6306b) {
        if (AbstractC16544l.m18089b(c6306b, C6306b.f20437o0)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c6306b, 10));
        Iterator it = c6306b.f20438Y.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6305a) it.next()).f20436a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = AbstractC20064h.m20900d((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
