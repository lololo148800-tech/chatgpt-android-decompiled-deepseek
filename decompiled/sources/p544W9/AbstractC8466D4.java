package p544W9;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import mm.C17296C;
import p026Ao.AbstractC0668b;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.C0656E;
import p354O5.C6138h;
import p523V9.AbstractC7942M5;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.D4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8466D4 {
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: a */
    public static final Object m9095a(InterfaceC15088n interfaceC15088n, AbstractC0682p abstractC0682p, C0654C c0654c, AbstractC19687c abstractC19687c) {
        C6138h c6138h;
        ?? th2;
        Closeable closeable;
        Throwable th3;
        Closeable closeable2;
        if (abstractC19687c instanceof C6138h) {
            c6138h = (C6138h) abstractC19687c;
            int i10 = c6138h.f20007o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6138h.f20007o0 = i10 - Integer.MIN_VALUE;
            } else {
                c6138h = new C6138h(abstractC19687c);
            }
        } else {
            c6138h = new C6138h(abstractC19687c);
        }
        Object objM16177e = c6138h.f20006Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6138h.f20007o0;
        Long th4 = null;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM16177e);
            if (abstractC0682p == AbstractC0682p.f1991a) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(c0654c.m1322f(), "rw");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    c6138h.f20005Y = randomAccessFile;
                    c6138h.f20007o0 = 1;
                    objM16177e = AbstractC15070F.m16177e(interfaceC15088n, channel, Long.MAX_VALUE, c6138h);
                    if (objM16177e == enumC19250a) {
                        return enumC19250a;
                    }
                    closeable2 = randomAccessFile;
                    ((Number) objM16177e).longValue();
                    AbstractC7942M5.m8232a(closeable2, null);
                } catch (Throwable th5) {
                    th3 = th5;
                    closeable2 = randomAccessFile;
                    throw th3;
                }
            } else {
                C0656E c0656eM1402b = AbstractC0668b.m1402b(abstractC0682p.mo1399i(c0654c, false));
                try {
                    c6138h.f20005Y = c0656eM1402b;
                    c6138h.f20007o0 = 2;
                    objM16177e = AbstractC15070F.m16177e(interfaceC15088n, c0656eM1402b, Long.MAX_VALUE, c6138h);
                    if (objM16177e == enumC19250a) {
                        return enumC19250a;
                    }
                    closeable = c0656eM1402b;
                    Long l4 = new Long(((Number) objM16177e).longValue());
                    if (closeable != null) {
                        closeable.close();
                    }
                    th2 = th4;
                    th4 = l4;
                    if (th2 == 0) {
                        throw th2;
                    }
                    th4.getClass();
                } catch (Throwable th6) {
                    th2 = th6;
                    closeable = c0656eM1402b;
                    if (closeable != null) {
                        closeable.close();
                    }
                }
            }
        } else if (i11 == 1) {
            closeable2 = c6138h.f20005Y;
            try {
                AbstractC9233X.m9807c(objM16177e);
                ((Number) objM16177e).longValue();
                AbstractC7942M5.m8232a(closeable2, null);
            } catch (Throwable th7) {
                th3 = th7;
                try {
                    throw th3;
                } catch (Throwable th8) {
                    AbstractC7942M5.m8232a(closeable2, th3);
                    throw th8;
                }
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = c6138h.f20005Y;
            try {
                AbstractC9233X.m9807c(objM16177e);
                Long l10 = new Long(((Number) objM16177e).longValue());
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th9) {
                        th4 = th9;
                    }
                }
                th2 = th4;
                th4 = l10;
            } catch (Throwable th10) {
                th2 = th10;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th11) {
                        AbstractC9221V.m9789a(th2, th11);
                    }
                }
            }
            if (th2 == 0) {
                throw th2;
            }
            th4.getClass();
        }
        return C17296C.f55119a;
    }
}
