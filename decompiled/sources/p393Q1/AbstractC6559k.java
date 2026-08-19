package p393Q1;

import android.text.TextPaint;
import java.util.ArrayList;
import p204I1.C3599o;
import p204I1.C3601q;
import p467T1.C7200j;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.InterfaceC14362r;
import p821j1.AbstractC16040e;

/* JADX INFO: renamed from: Q1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6559k {

    /* JADX INFO: renamed from: a */
    public static final C6560l f21227a = new C6560l(false);

    /* JADX INFO: renamed from: a */
    public static final void m7124a(C3599o c3599o, InterfaceC14362r interfaceC14362r, AbstractC14360p abstractC14360p, float f10, C14338P c14338p, C7200j c7200j, AbstractC16040e abstractC16040e, int i10) {
        ArrayList arrayList = c3599o.f10965h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3601q c3601q = (C3601q) arrayList.get(i11);
            c3601q.f10968a.m4287g(interfaceC14362r, abstractC14360p, f10, c14338p, c7200j, abstractC16040e, i10);
            interfaceC14362r.mo15717p(0.0f, c3601q.f10968a.m4282b());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7125b(TextPaint textPaint, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f10 * 255));
    }
}
