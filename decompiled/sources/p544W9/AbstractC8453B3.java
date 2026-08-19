package p544W9;

import io.ktor.utils.p815io.AbstractC15070F;
import java.util.Map;
import mm.C17296C;
import p026Ao.C0675i;
import p307M5.C5298c;
import p354O5.C6135e;
import p571X9.AbstractC9233X;
import p817j$.util.concurrent.ConcurrentHashMap;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.B3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8453B3 {
    /* JADX INFO: renamed from: a */
    public static ConcurrentHashMap m9064a(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m9065b(C6135e c6135e, AbstractC19687c abstractC19687c) {
        C5298c c5298c;
        C6135e c6135e2;
        Throwable th2;
        C0675i c0675i;
        if (abstractC19687c instanceof C5298c) {
            c5298c = (C5298c) abstractC19687c;
            int i10 = c5298c.f17463p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5298c.f17463p0 = i10 - Integer.MIN_VALUE;
            } else {
                c5298c = new C5298c(abstractC19687c);
            }
        } else {
            c5298c = new C5298c(abstractC19687c);
        }
        Object obj = c5298c.f17462o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5298c.f17463p0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0675i = c5298c.f17461Z;
            c6135e2 = c5298c.f17460Y;
            try {
                AbstractC9233X.m9807c(obj);
                AbstractC8706s.m9414b(c6135e2, null);
                return c0675i;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    AbstractC8706s.m9414b(c6135e2, th2);
                    throw th4;
                }
            }
        }
        AbstractC9233X.m9807c(obj);
        try {
            C0675i c0675i2 = new C0675i();
            c5298c.f17460Y = c6135e;
            c5298c.f17461Z = c0675i2;
            c5298c.f17463p0 = 1;
            Object objM16177e = AbstractC15070F.m16177e(c6135e.f19995Y, c0675i2, Long.MAX_VALUE, c5298c);
            Object obj2 = C17296C.f55119a;
            if (objM16177e != enumC19250a) {
                objM16177e = obj2;
            }
            if (objM16177e == enumC19250a) {
                obj2 = objM16177e;
            }
            if (obj2 == enumC19250a) {
                return enumC19250a;
            }
            c6135e2 = c6135e;
            c0675i = c0675i2;
            AbstractC8706s.m9414b(c6135e2, null);
            return c0675i;
        } catch (Throwable th5) {
            c6135e2 = c6135e;
            th2 = th5;
            throw th2;
        }
    }
}
