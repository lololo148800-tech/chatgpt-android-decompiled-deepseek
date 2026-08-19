package p214Ib;

import java.io.IOException;
import java.io.StringWriter;
import p288Lb.AbstractC4992y;
import p288Lb.C4988u;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Ib.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3673p {
    /* JADX INFO: renamed from: f */
    public boolean mo4380f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: i */
    public int mo4381i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: j */
    public final C3671n m4389j() {
        if (this instanceof C3671n) {
            return (C3671n) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* JADX INFO: renamed from: m */
    public final C3676s m4390m() {
        if (this instanceof C3676s) {
            return (C3676s) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* JADX INFO: renamed from: p */
    public long mo4382p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: q */
    public Number mo4383q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: r */
    public String mo4384r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C6382c c6382c = new C6382c(stringWriter);
            c6382c.f20797q0 = true;
            C4988u c4988u = AbstractC4992y.f16272a;
            C3666i.m4365d(c6382c, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
