package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.datastore.preferences.protobuf.C10962h0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: com.google.protobuf.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C12110N {

    /* JADX INFO: renamed from: c */
    public static final C12110N f36961c = new C12110N(0);

    /* JADX INFO: renamed from: a */
    public final C12140b1 f36962a = new C12140b1(16);

    /* JADX INFO: renamed from: b */
    public boolean f36963b;

    public C12110N() {
    }

    /* JADX INFO: renamed from: c */
    public static int m13836c(EnumC12101J1 enumC12101J1, int i10, Object obj) {
        int iM14146t0 = AbstractC12195u.m14146t0(i10);
        if (enumC12101J1 == EnumC12101J1.f36917q0) {
            iM14146t0 *= 2;
        }
        return m13837d(enumC12101J1, obj) + iM14146t0;
    }

    /* JADX INFO: renamed from: d */
    public static int m13837d(EnumC12101J1 enumC12101J1, Object obj) {
        switch (enumC12101J1.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = AbstractC12195u.f37108d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC12195u.f37108d;
                return 4;
            case 2:
                return AbstractC12195u.m14150x0(((Long) obj).longValue());
            case 3:
                return AbstractC12195u.m14150x0(((Long) obj).longValue());
            case 4:
                return AbstractC12195u.m14138l0(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = AbstractC12195u.f37108d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = AbstractC12195u.f37108d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = AbstractC12195u.f37108d;
                return 1;
            case 8:
                return obj instanceof AbstractC12171m ? AbstractC12195u.m14130d0((AbstractC12171m) obj) : AbstractC12195u.m14145s0((String) obj);
            case 9:
                Logger logger6 = AbstractC12195u.f37108d;
                return ((InterfaceC12091G0) obj).getSerializedSize();
            case 10:
                Logger logger7 = AbstractC12195u.f37108d;
                int serializedSize = ((InterfaceC12091G0) obj).getSerializedSize();
                return AbstractC12195u.m14148v0(serializedSize) + serializedSize;
            case 11:
                if (obj instanceof AbstractC12171m) {
                    return AbstractC12195u.m14130d0((AbstractC12171m) obj);
                }
                Logger logger8 = AbstractC12195u.f37108d;
                int length = ((byte[]) obj).length;
                return AbstractC12195u.m14148v0(length) + length;
            case 12:
                return AbstractC12195u.m14148v0(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC12151f0 ? AbstractC12195u.m14138l0(((InterfaceC12151f0) obj).getNumber()) : AbstractC12195u.m14138l0(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = AbstractC12195u.f37108d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = AbstractC12195u.f37108d;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC12195u.m14148v0((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC12195u.m14150x0((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m13838e(C12127W c12127w, Object obj) {
        EnumC12101J1 enumC12101J1 = c12127w.f36984Z;
        boolean z6 = c12127w.f36985o0;
        int i10 = c12127w.f36983Y;
        if (!z6) {
            return m13836c(enumC12101J1, i10, obj);
        }
        List list = (List) obj;
        int iM13836c = 0;
        if (!c12127w.f36986p0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iM13836c += m13836c(enumC12101J1, i10, it.next());
            }
            return iM13836c;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iM13836c += m13837d(enumC12101J1, it2.next());
        }
        return AbstractC12195u.m14148v0(iM13836c) + AbstractC12195u.m14146t0(i10) + iM13836c;
    }

    /* JADX INFO: renamed from: g */
    public static int m13839g(Map.Entry entry) {
        C12127W c12127w = (C12127W) entry.getKey();
        Object value = entry.getValue();
        if (c12127w.f36984Z.f36922Y != EnumC12104K1.MESSAGE || c12127w.f36985o0 || c12127w.f36986p0) {
            return m13838e(c12127w, value);
        }
        int i10 = ((C12127W) entry.getKey()).f36983Y;
        int iM14147u0 = AbstractC12195u.m14147u0(2, i10) + (AbstractC12195u.m14146t0(1) * 2);
        int iM14146t0 = AbstractC12195u.m14146t0(3);
        int serializedSize = ((InterfaceC12091G0) value).getSerializedSize();
        return AbstractC10763a.m11040A(serializedSize, serializedSize, iM14146t0, iM14147u0);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m13840k(Map.Entry entry) {
        C12127W c12127w = (C12127W) entry.getKey();
        if (c12127w.f36984Z.f36922Y != EnumC12104K1.MESSAGE) {
            return true;
        }
        if (!c12127w.f36985o0) {
            Object value = entry.getValue();
            if (value instanceof InterfaceC12094H0) {
                return ((InterfaceC12094H0) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        for (Object obj : (List) entry.getValue()) {
            if (!(obj instanceof InterfaceC12094H0)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((InterfaceC12094H0) obj).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: q */
    public static void m13841q(C12127W c12127w, Object obj) {
        boolean z6;
        EnumC12101J1 enumC12101J1 = c12127w.f36984Z;
        Charset charset = AbstractC12175n0.f37050a;
        obj.getClass();
        switch (enumC12101J1.f36922Y) {
            case INT:
                z6 = obj instanceof Integer;
                break;
            case LONG:
                z6 = obj instanceof Long;
                break;
            case FLOAT:
                z6 = obj instanceof Float;
                break;
            case DOUBLE:
                z6 = obj instanceof Double;
                break;
            case BOOLEAN:
                z6 = obj instanceof Boolean;
                break;
            case STRING:
                z6 = obj instanceof String;
                break;
            case BYTE_STRING:
                if ((obj instanceof AbstractC12171m) || (obj instanceof byte[])) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC12151f0)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                break;
            case MESSAGE:
                z6 = obj instanceof InterfaceC12091G0;
                break;
            default:
                z6 = false;
                break;
        }
        if (!z6) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c12127w.f36983Y), c12127w.f36984Z.f36922Y, obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m13842r(AbstractC12195u abstractC12195u, EnumC12101J1 enumC12101J1, int i10, Object obj) {
        if (enumC12101J1 == EnumC12101J1.f36917q0) {
            abstractC12195u.mo14108Q0(i10, 3);
            ((InterfaceC12091G0) obj).writeTo(abstractC12195u);
            abstractC12195u.mo14108Q0(i10, 4);
            return;
        }
        abstractC12195u.mo14108Q0(i10, enumC12101J1.f36923Z);
        switch (enumC12101J1.ordinal()) {
            case 0:
                abstractC12195u.mo14099H0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC12195u.mo14097F0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC12195u.mo14112U0(((Long) obj).longValue());
                break;
            case 3:
                abstractC12195u.mo14112U0(((Long) obj).longValue());
                break;
            case 4:
                abstractC12195u.mo14101J0(((Integer) obj).intValue());
                break;
            case 5:
                abstractC12195u.mo14099H0(((Long) obj).longValue());
                break;
            case 6:
                abstractC12195u.mo14097F0(((Integer) obj).intValue());
                break;
            case 7:
                abstractC12195u.mo14115z0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC12171m)) {
                    abstractC12195u.mo14107P0((String) obj);
                } else {
                    abstractC12195u.mo14095D0((AbstractC12171m) obj);
                }
                break;
            case 9:
                ((InterfaceC12091G0) obj).writeTo(abstractC12195u);
                break;
            case 10:
                abstractC12195u.mo14103L0((InterfaceC12091G0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC12171m)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC12195u.mo14093B0(bArr.length, bArr);
                } else {
                    abstractC12195u.mo14095D0((AbstractC12171m) obj);
                }
                break;
            case 12:
                abstractC12195u.mo14110S0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC12151f0)) {
                    abstractC12195u.mo14101J0(((Integer) obj).intValue());
                } else {
                    abstractC12195u.mo14101J0(((InterfaceC12151f0) obj).getNumber());
                }
                break;
            case 14:
                abstractC12195u.mo14097F0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC12195u.mo14099H0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC12195u.mo14110S0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC12195u.mo14112U0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13843a(C12127W c12127w, Object obj) {
        List arrayList;
        if (!c12127w.f36985o0) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m13841q(c12127w, obj);
        C12140b1 c12140b1 = this.f36962a;
        Object obj2 = c12140b1.get(c12127w);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c12140b1.put(c12127w, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C12110N clone() {
        C12140b1 c12140b1;
        C12110N c12110n = new C12110N();
        int i10 = 0;
        while (true) {
            c12140b1 = this.f36962a;
            if (i10 >= c12140b1.f37016Z.size()) {
                break;
            }
            Map.Entry entryM13931c = c12140b1.m13931c(i10);
            c12110n.m13853p((C12127W) entryM13931c.getKey(), entryM13931c.getValue());
            i10++;
        }
        for (Map.Entry entry : c12140b1.m13932d()) {
            c12110n.m13853p((C12127W) entry.getKey(), entry.getValue());
        }
        return c12110n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12110N) {
            return this.f36962a.equals(((C12110N) obj).f36962a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m13845f() {
        C12140b1 c12140b1;
        int i10 = 0;
        int iM13839g = 0;
        while (true) {
            c12140b1 = this.f36962a;
            if (i10 >= c12140b1.f37016Z.size()) {
                break;
            }
            iM13839g += m13839g(c12140b1.m13931c(i10));
            i10++;
        }
        Iterator it = c12140b1.m13932d().iterator();
        while (it.hasNext()) {
            iM13839g += m13839g((Map.Entry) it.next());
        }
        return iM13839g;
    }

    /* JADX INFO: renamed from: h */
    public final int m13846h() {
        C12140b1 c12140b1;
        int i10 = 0;
        int iM13838e = 0;
        while (true) {
            c12140b1 = this.f36962a;
            if (i10 >= c12140b1.f37016Z.size()) {
                break;
            }
            Map.Entry entryM13931c = c12140b1.m13931c(i10);
            iM13838e += m13838e((C12127W) entryM13931c.getKey(), entryM13931c.getValue());
            i10++;
        }
        for (Map.Entry entry : c12140b1.m13932d()) {
            iM13838e += m13838e((C12127W) entry.getKey(), entry.getValue());
        }
        return iM13838e;
    }

    public final int hashCode() {
        return this.f36962a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m13847i() {
        return this.f36962a.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m13848j() {
        int i10 = 0;
        while (true) {
            C12140b1 c12140b1 = this.f36962a;
            if (i10 >= c12140b1.f37016Z.size()) {
                Iterator it = c12140b1.m13932d().iterator();
                while (it.hasNext()) {
                    if (!m13840k((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m13840k(c12140b1.m13931c(i10))) {
                return false;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: l */
    public final Iterator m13849l() {
        return ((C10962h0) this.f36962a.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: m */
    public final void m13850m() {
        C12140b1 c12140b1;
        if (this.f36963b) {
            return;
        }
        int i10 = 0;
        while (true) {
            c12140b1 = this.f36962a;
            if (i10 >= c12140b1.f37016Z.size()) {
                break;
            }
            Map.Entry entryM13931c = c12140b1.m13931c(i10);
            if (entryM13931c.getValue() instanceof AbstractC12133Z) {
                ((AbstractC12133Z) entryM13931c.getValue()).makeImmutable();
            }
            i10++;
        }
        if (!c12140b1.f37018p0) {
            for (int i11 = 0; i11 < c12140b1.f37016Z.size(); i11++) {
                Map.Entry entryM13931c2 = c12140b1.m13931c(i11);
                if (((C12127W) entryM13931c2.getKey()).f36985o0) {
                    entryM13931c2.setValue(DesugarCollections.unmodifiableList((List) entryM13931c2.getValue()));
                }
            }
            for (Map.Entry entry : c12140b1.m13932d()) {
                if (((C12127W) entry.getKey()).f36985o0) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!c12140b1.f37018p0) {
            c12140b1.f37017o0 = c12140b1.f37017o0.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(c12140b1.f37017o0);
            c12140b1.f37020r0 = c12140b1.f37020r0.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(c12140b1.f37020r0);
            c12140b1.f37018p0 = true;
        }
        this.f36963b = true;
    }

    /* JADX INFO: renamed from: n */
    public final void m13851n(C12110N c12110n) {
        C12140b1 c12140b1;
        int i10 = 0;
        while (true) {
            int size = c12110n.f36962a.f37016Z.size();
            c12140b1 = c12110n.f36962a;
            if (i10 >= size) {
                break;
            }
            m13852o(c12140b1.m13931c(i10));
            i10++;
        }
        Iterator it = c12140b1.m13932d().iterator();
        while (it.hasNext()) {
            m13852o((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m13852o(Map.Entry entry) {
        C12127W c12127w = (C12127W) entry.getKey();
        Object value = entry.getValue();
        boolean z6 = c12127w.f36985o0;
        C12140b1 c12140b1 = this.f36962a;
        if (z6) {
            Object arrayList = c12140b1.get(c12127w);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c12140b1.put(c12127w, arrayList);
            return;
        }
        if (c12127w.f36984Z.f36922Y != EnumC12104K1.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c12140b1.put(c12127w, value);
            return;
        }
        Object obj2 = c12140b1.get(c12127w);
        if (obj2 != null) {
            AbstractC12121T abstractC12121T = (AbstractC12121T) ((InterfaceC12091G0) obj2).toBuilder();
            abstractC12121T.m13865f((AbstractC12133Z) ((InterfaceC12091G0) value));
            c12140b1.put(c12127w, abstractC12121T.m13861b());
        } else {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            c12140b1.put(c12127w, value);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m13853p(C12127W c12127w, Object obj) {
        if (!c12127w.f36985o0) {
            m13841q(c12127w, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m13841q(c12127w, it.next());
            }
            obj = arrayList;
        }
        this.f36962a.put(c12127w, obj);
    }

    public C12110N(int i10) {
        m13850m();
        m13850m();
    }
}
