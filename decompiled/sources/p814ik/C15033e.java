package p814ik;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p571X9.AbstractC9227W;
import p722e8.C13298H;

/* JADX INFO: renamed from: ik.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15033e {

    /* JADX INFO: renamed from: a */
    public final Context f46730a;

    /* JADX INFO: renamed from: b */
    public final C17314q f46731b;

    /* JADX INFO: renamed from: c */
    public String f46732c;

    public C15033e(Context context) {
        AbstractC16544l.m18094g(context, "context");
        this.f46730a = context;
        this.f46731b = AbstractC9227W.m9800c(new C13298H(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public final void m16161a(String str) {
        if ((!str.equals(this.f46732c) ? str : null) != null) {
            this.f46732c = str;
            ((SharedPreferences) this.f46731b.getValue()).edit().putString("DEVICE_ID", this.f46732c).apply();
        }
    }
}
