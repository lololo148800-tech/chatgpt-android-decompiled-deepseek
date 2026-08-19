package com.segment.analytics.kotlin.core;

import bo.AbstractC11516d;
import kotlinx.serialization.json.C16644c;
import mm.C17296C;
import p530Vi.C8293A;
import p530Vi.C8297E;
import p530Vi.C8304L;
import p530Vi.C8330z;
import p530Vi.InterfaceC8294B;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: com.segment.analytics.kotlin.core.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12776c {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m14523a(InterfaceC8294B interfaceC8294B, C8297E c8297e, InterfaceC18770c interfaceC18770c) {
        C8330z c8330z;
        if (interfaceC18770c instanceof C8330z) {
            c8330z = (C8330z) interfaceC18770c;
            int i10 = c8330z.f25971Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c8330z.f25971Z = i10 - Integer.MIN_VALUE;
            } else {
                c8330z = new C8330z(interfaceC18770c);
            }
        } else {
            c8330z = new C8330z(interfaceC18770c);
        }
        Object obj = c8330z.f25970Y;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c8330z.f25971Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            Settings settings = c8297e.f25854b;
            if (settings != null) {
                String strM12905d = AbstractC11516d.f34842d.m12905d(Settings.INSTANCE.serializer(), settings);
                c8330z.f25971Z = 1;
                if (interfaceC8294B.mo7524a(4, strM12905d, c8330z) == obj2) {
                    return obj2;
                }
            } else {
                interfaceC8294B.remove(4);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static Object m14524b(InterfaceC8294B interfaceC8294B, C8304L c8304l, InterfaceC18770c interfaceC18770c) {
        C8293A c8293a;
        InterfaceC8294B interfaceC8294B2;
        C8304L c8304l2;
        C16644c c16644c;
        String strM12905d;
        if (interfaceC18770c instanceof C8293A) {
            c8293a = (C8293A) interfaceC18770c;
            int i10 = c8293a.f25848p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c8293a.f25848p0 = i10 - Integer.MIN_VALUE;
            } else {
                c8293a = new C8293A(interfaceC18770c);
            }
        } else {
            c8293a = new C8293A(interfaceC18770c);
        }
        Object obj = c8293a.f25847o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c8293a.f25848p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c8304l = c8293a.f25846Z;
                interfaceC8294B = c8293a.f25845Y;
                AbstractC9233X.m9807c(obj);
            } else if (i11 == 2) {
                c8304l2 = c8293a.f25846Z;
                interfaceC8294B2 = c8293a.f25845Y;
                AbstractC9233X.m9807c(obj);
                InterfaceC8294B interfaceC8294B3 = interfaceC8294B2;
                c8304l = c8304l2;
                interfaceC8294B = interfaceC8294B3;
                c16644c = c8304l.f25880c;
                if (c16644c != null) {
                    strM12905d = AbstractC11516d.f34842d.m12905d(C16644c.Companion.serializer(), c16644c);
                    c8293a.f25845Y = interfaceC8294B;
                    c8293a.f25846Z = null;
                    c8293a.f25848p0 = 3;
                    if (interfaceC8294B.mo7524a(2, strM12905d, c8293a) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    interfaceC8294B.remove(2);
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        String str = c8304l.f25878a;
        c8293a.f25845Y = interfaceC8294B;
        c8293a.f25846Z = c8304l;
        c8293a.f25848p0 = 1;
        if (interfaceC8294B.mo7524a(3, str, c8293a) == enumC19250a) {
            return enumC19250a;
        }
        String str2 = c8304l.f25879b;
        if (str2 != null) {
            c8293a.f25845Y = interfaceC8294B;
            c8293a.f25846Z = c8304l;
            c8293a.f25848p0 = 2;
            if (interfaceC8294B.mo7524a(1, str2, c8293a) == enumC19250a) {
                return enumC19250a;
            }
            C8304L c8304l3 = c8304l;
            interfaceC8294B2 = interfaceC8294B;
            c8304l2 = c8304l3;
            InterfaceC8294B interfaceC8294B4 = interfaceC8294B2;
            c8304l = c8304l2;
            interfaceC8294B = interfaceC8294B4;
        } else {
            interfaceC8294B.remove(1);
        }
        c16644c = c8304l.f25880c;
        if (c16644c != null) {
            strM12905d = AbstractC11516d.f34842d.m12905d(C16644c.Companion.serializer(), c16644c);
            c8293a.f25845Y = interfaceC8294B;
            c8293a.f25846Z = null;
            c8293a.f25848p0 = 3;
            if (interfaceC8294B.mo7524a(2, strM12905d, c8293a) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            interfaceC8294B.remove(2);
        }
        return C17296C.f55119a;
    }
}
