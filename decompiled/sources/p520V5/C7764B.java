package p520V5;

import java.util.Arrays;

/* JADX INFO: renamed from: V5.B */
/* JADX INFO: loaded from: classes.dex */
public final class C7764B {

    /* JADX INFO: renamed from: a */
    public final C7781j f24539a;

    /* JADX INFO: renamed from: b */
    public final Throwable f24540b;

    public C7764B(C7781j c7781j) {
        this.f24539a = c7781j;
        this.f24540b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7764B)) {
            return false;
        }
        C7764B c7764b = (C7764B) obj;
        C7781j c7781j = this.f24539a;
        if (c7781j != null && c7781j.equals(c7764b.f24539a)) {
            return true;
        }
        Throwable th2 = this.f24540b;
        if (th2 == null || c7764b.f24540b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24539a, this.f24540b});
    }

    public C7764B(Throwable th2) {
        this.f24540b = th2;
        this.f24539a = null;
    }
}
