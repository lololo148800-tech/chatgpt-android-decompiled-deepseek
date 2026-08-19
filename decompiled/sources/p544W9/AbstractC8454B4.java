package p544W9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p351O2.C6091e;
import p351O2.C6093g;
import p351O2.C6111y;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.B4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8454B4 {
    /* JADX INFO: renamed from: a */
    public static final long m9066a(long j10) {
        float fM15306g = C13800b.m15306g(j10);
        return (((long) Float.floatToRawIntBits(C13800b.m15307h(j10))) & 4294967295L) | (Float.floatToRawIntBits(fM15306g) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    public static final Object m9067b(List list, C6111y c6111y, AbstractC19687c abstractC19687c) throws Throwable {
        C6091e c6091e;
        List list2;
        C16525B c16525b;
        Iterator it;
        Throwable th2;
        InterfaceC1436k interfaceC1436k;
        if (abstractC19687c instanceof C6091e) {
            c6091e = (C6091e) abstractC19687c;
            int i10 = c6091e.f19829p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6091e.f19829p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6091e = new C6091e(abstractC19687c);
            }
        } else {
            c6091e = new C6091e(abstractC19687c);
        }
        Object obj = c6091e.f19828o0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c6091e.f19829p0;
        if (i11 != 0) {
            if (i11 == 1) {
                list2 = (List) c6091e.f19826Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c6091e.f19827Z;
                c16525b = (C16525B) c6091e.f19826Y;
                try {
                    AbstractC9233X.m9807c(obj);
                } catch (Throwable th3) {
                    Object obj3 = c16525b.f51262Y;
                    if (obj3 == null) {
                        c16525b.f51262Y = th3;
                    } else {
                        AbstractC9221V.m9789a((Throwable) obj3, th3);
                    }
                }
            }
            while (it.hasNext()) {
                interfaceC1436k = (InterfaceC1436k) it.next();
                c6091e.f19826Y = c16525b;
                c6091e.f19827Z = it;
                c6091e.f19829p0 = 2;
                if (interfaceC1436k.invoke(c6091e) == obj2) {
                    return obj2;
                }
            }
            th2 = (Throwable) c16525b.f51262Y;
            if (th2 == null) {
                return C17296C.f55119a;
            }
            throw th2;
        }
        AbstractC9233X.m9807c(obj);
        ArrayList arrayList = new ArrayList();
        C6093g c6093g = new C6093g(list, arrayList, null);
        c6091e.f19826Y = arrayList;
        c6091e.f19829p0 = 1;
        if (c6111y.m6664a(c6093g, c6091e) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        c16525b = new C16525B();
        it = list2.iterator();
        while (it.hasNext()) {
            interfaceC1436k = (InterfaceC1436k) it.next();
            c6091e.f19826Y = c16525b;
            c6091e.f19827Z = it;
            c6091e.f19829p0 = 2;
            if (interfaceC1436k.invoke(c6091e) == obj2) {
                return obj2;
            }
        }
        th2 = (Throwable) c16525b.f51262Y;
        if (th2 == null) {
            return C17296C.f55119a;
        }
        throw th2;
    }

    /* JADX INFO: renamed from: c */
    public static final long m9068c(long j10) {
        return AbstractC8088f6.m8536b(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }
}
