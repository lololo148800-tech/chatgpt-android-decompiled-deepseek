package p033B5;

import android.content.Context;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p374P5.C6352e;

/* JADX INFO: renamed from: B5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0835s {

    /* JADX INFO: renamed from: a */
    public final Context f2316a;

    /* JADX INFO: renamed from: b */
    public final C6352e f2317b;

    /* JADX INFO: renamed from: c */
    public final C17314q f2318c;

    /* JADX INFO: renamed from: d */
    public final C17314q f2319d;

    /* JADX INFO: renamed from: e */
    public final C0823g f2320e;

    public C0835s(Context context, C6352e c6352e, C17314q c17314q, C17314q c17314q2, C0823g c0823g) {
        this.f2316a = context;
        this.f2317b = c6352e;
        this.f2318c = c17314q;
        this.f2319d = c17314q2;
        this.f2320e = c0823g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0835s)) {
            return false;
        }
        C0835s c0835s = (C0835s) obj;
        if (!AbstractC16544l.m18089b(this.f2316a, c0835s.f2316a) || !this.f2317b.equals(c0835s.f2317b) || !this.f2318c.equals(c0835s.f2318c) || !this.f2319d.equals(c0835s.f2319d)) {
            return false;
        }
        Object obj2 = C0826j.f2306a;
        return obj2.equals(obj2) && this.f2320e.equals(c0835s.f2320e) && AbstractC16544l.m18089b(null, null);
    }

    public final int hashCode() {
        return (this.f2320e.hashCode() + ((C0826j.f2306a.hashCode() + ((this.f2319d.hashCode() + ((this.f2318c.hashCode() + ((this.f2317b.hashCode() + (this.f2316a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.f2316a + ", defaults=" + this.f2317b + ", memoryCacheLazy=" + this.f2318c + ", diskCacheLazy=" + this.f2319d + ", eventListenerFactory=" + C0826j.f2306a + ", componentRegistry=" + this.f2320e + YladLSetV.xLqodQE;
    }
}
