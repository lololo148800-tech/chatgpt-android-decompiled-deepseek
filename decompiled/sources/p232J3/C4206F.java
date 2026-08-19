package p232J3;

import java.io.IOException;
import java.util.Locale;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: J3.F */
/* JADX INFO: loaded from: classes.dex */
public final class C4206F extends IOException {
    public /* synthetic */ C4206F(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4206F(long j10, long j11, int i10, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbM9894m = AbstractC9306j0.m9894m("Pos: ", j10, ", limit: ");
        sbM9894m.append(j11);
        sbM9894m.append(", len: ");
        sbM9894m.append(i10);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbM9894m.toString()), indexOutOfBoundsException);
    }

    public C4206F(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
