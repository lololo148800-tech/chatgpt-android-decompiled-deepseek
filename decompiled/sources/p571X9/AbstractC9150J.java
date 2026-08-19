package p571X9;

import bg.C11425y;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p364Oh.AbstractC6224C;
import p364Oh.C6222A;
import p364Oh.C6223B;
import p364Oh.C6229c;
import p364Oh.C6248v;
import p523V9.AbstractC8128k6;
import p592Y7.AbstractC9667b;
import p592Y7.InterfaceC9670e;
import p743f7.InterfaceC13575a;
import p765g7.InterfaceC13823a;
import p775h2.AbstractC14376f;
import p804i8.InterfaceC14942a;
import p888m8.C17197b;
import p888m8.C17198c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: X9.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9150J {
    /* JADX INFO: renamed from: a */
    public static final boolean m9696a(AbstractC6224C abstractC6224C) {
        int i10;
        AbstractC16544l.m18094g(abstractC6224C, "<this>");
        if ((abstractC6224C instanceof C6223B) || (abstractC6224C instanceof C6248v)) {
            return false;
        }
        return !(abstractC6224C instanceof C6222A) || 400 > (i10 = ((C6222A) abstractC6224C).f20254b) || i10 >= 500;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final C17198c m9697b(InterfaceC13823a interfaceC13823a, InterfaceC13575a rumDataWriter, int i10, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(rumDataWriter, "rumDataWriter");
        AbstractC14376f.m15825D(i10, "eventType");
        AbstractC16544l.m18094g(rumDataWriter, "rumDataWriter");
        AbstractC14376f.m15825D(i10, "eventType");
        C17198c c17198c = new C17198c();
        c17198c.f54901b = interfaceC13823a;
        c17198c.f54902c = rumDataWriter;
        c17198c.f54900a = i10;
        c17198c.f54903d = (AbstractC16546n) interfaceC1436k;
        InterfaceC9670e interfaceC9670eM10254a = AbstractC9667b.m10254a(interfaceC13823a);
        c17198c.f54906g = interfaceC9670eM10254a instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a : null;
        C17197b c17197b = C17197b.f54899Y;
        c17198c.f54904e = c17197b;
        c17198c.f54905f = c17197b;
        return c17198c;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:21:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cd -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m9698c(int r17, long r18, long r20, int r22, p049Bm.InterfaceC1436k r23, p049Bm.InterfaceC1436k r24, p049Bm.InterfaceC1439n r25, sm.AbstractC19687c r26) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p571X9.AbstractC9150J.m9698c(int, long, long, int, Bm.k, Bm.k, Bm.n, sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m9699d(int i10, long j10, InterfaceC1436k interfaceC1436k, C11425y c11425y, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c, int i11) {
        long jM8644j;
        int i12 = (i11 & 1) != 0 ? 4 : i10;
        if ((i11 & 2) != 0) {
            C21554a c21554a = C21555b.f68260Z;
            jM8644j = AbstractC8128k6.m8644j(1, EnumC21557d.SECONDS);
        } else {
            jM8644j = j10;
        }
        C21554a c21554a2 = C21555b.f68260Z;
        return m9698c(i12, jM8644j, AbstractC8128k6.m8644j(5, EnumC21557d.MINUTES), 2, (i11 & 16) != 0 ? C6229c.f20288o0 : interfaceC1436k, (i11 & 32) != 0 ? C6229c.f20289p0 : c11425y, interfaceC1439n, abstractC19687c);
    }
}
