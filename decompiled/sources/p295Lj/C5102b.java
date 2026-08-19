package p295Lj;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1109xj.C21277a;

/* JADX INFO: renamed from: Lj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5102b {

    /* JADX INFO: renamed from: a */
    public boolean f16677a;

    /* JADX INFO: renamed from: b */
    public boolean f16678b;

    /* JADX INFO: renamed from: c */
    public final Object f16679c;

    public C5102b(Context context) {
        this.f16678b = true;
        this.f16679c = new C21277a(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5664a(Throwable e10) {
        AbstractC16544l.m18094g(e10, "e");
        if (this.f16678b) {
            try {
                ((C21277a) this.f16679c).m21620a(e10);
            } catch (Exception unused) {
            }
        }
    }

    public C5102b(ArrayList arrayList, boolean z6, boolean z10) {
        this.f16679c = arrayList;
        this.f16678b = z6;
        this.f16677a = z10;
    }
}
