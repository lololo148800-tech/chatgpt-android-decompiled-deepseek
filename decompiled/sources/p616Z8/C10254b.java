package p616Z8;

import android.content.Context;
import p571X9.AbstractC9306j0;
import p782h9.InterfaceC14430a;

/* JADX INFO: renamed from: Z8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10254b extends AbstractC10255c {

    /* JADX INFO: renamed from: a */
    public final Context f30462a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC14430a f30463b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC14430a f30464c;

    /* JADX INFO: renamed from: d */
    public final String f30465d;

    public C10254b(Context context, InterfaceC14430a interfaceC14430a, InterfaceC14430a interfaceC14430a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f30462a = context;
        if (interfaceC14430a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f30463b = interfaceC14430a;
        if (interfaceC14430a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f30464c = interfaceC14430a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f30465d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10255c)) {
            return false;
        }
        AbstractC10255c abstractC10255c = (AbstractC10255c) obj;
        if (this.f30462a.equals(((C10254b) abstractC10255c).f30462a)) {
            C10254b c10254b = (C10254b) abstractC10255c;
            if (this.f30463b.equals(c10254b.f30463b) && this.f30464c.equals(c10254b.f30464c) && this.f30465d.equals(c10254b.f30465d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f30462a.hashCode() ^ 1000003) * 1000003) ^ this.f30463b.hashCode()) * 1000003) ^ this.f30464c.hashCode()) * 1000003) ^ this.f30465d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f30462a);
        sb2.append(", wallClock=");
        sb2.append(this.f30463b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f30464c);
        sb2.append(", backendName=");
        return AbstractC9306j0.m9891j(this.f30465d, "}", sb2);
    }
}
