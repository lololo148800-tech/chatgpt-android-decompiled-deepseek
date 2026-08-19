package p823j3;

import com.google.protobuf.AbstractC12107L1;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: j3.K */
/* JADX INFO: loaded from: classes.dex */
public final class C16072K extends CancellationException {

    /* JADX INFO: renamed from: Y */
    public final String f49766Y;

    /* JADX INFO: renamed from: Z */
    public final int f49767Z;

    public C16072K(String str, int i10) {
        super(str);
        this.f49766Y = str;
        this.f49767Z = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f49766Y;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeoutCancellationException(");
        sb2.append(this.f49766Y);
        sb2.append(", ");
        return AbstractC12107L1.m13826q(sb2, this.f49767Z, ')');
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
