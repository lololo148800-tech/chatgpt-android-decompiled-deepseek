package p909nm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1091wn.C21030k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: nm.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C17666K extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public Object f56457Z;

    /* JADX INFO: renamed from: o0 */
    public Iterator f56458o0;

    /* JADX INFO: renamed from: p0 */
    public int f56459p0;

    /* JADX INFO: renamed from: q0 */
    public int f56460q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f56461r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f56462s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f56463t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Iterator f56464u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17666K(int i10, int i11, Iterator it, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56462s0 = i10;
        this.f56463t0 = i11;
        this.f56464u0 = it;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C17666K c17666k = new C17666K(this.f56462s0, this.f56463t0, this.f56464u0, interfaceC18770c);
        c17666k.f56461r0 = obj;
        return c17666k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17666K) create((C21030k) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0144  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x007d A[SYNTHETIC] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        int i10;
        C17664I c17664i;
        C21030k c21030k;
        Iterator it;
        ArrayList arrayList;
        C21030k c21030k2;
        Iterator it2;
        int i11;
        Object next;
        C17664I c17664i2;
        C21030k c21030k3;
        Object next2;
        int iMo1316f;
        int i12;
        Object[] objArr;
        int i13;
        Object[] array;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i14 = this.f56460q0;
        int i15 = this.f56463t0;
        int i16 = this.f56462s0;
        if (i14 == 0) {
            AbstractC9233X.m9807c(obj);
            C21030k c21030k4 = (C21030k) this.f56461r0;
            int i17 = i16 <= 1024 ? i16 : 1024;
            i10 = i15 - i16;
            Iterator it3 = this.f56464u0;
            if (i10 >= 0) {
                arrayList = new ArrayList(i17);
                c21030k2 = c21030k4;
                it2 = it3;
                i11 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i11 > 0) {
                        i11--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i16) {
                            this.f56461r0 = c21030k2;
                            this.f56457Z = arrayList;
                            this.f56458o0 = it2;
                            this.f56459p0 = i10;
                            this.f56460q0 = 1;
                            c21030k2.m21482c(arrayList, this);
                            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                            return enumC19250a;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f56461r0 = null;
                    this.f56457Z = null;
                    this.f56458o0 = null;
                    this.f56460q0 = 2;
                    c21030k2.m21482c(arrayList, this);
                    EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                    return enumC19250a;
                }
            } else {
                c17664i = new C17664I(0, new Object[i17]);
                c21030k = c21030k4;
                it = it3;
                while (it.hasNext()) {
                    next2 = it.next();
                    iMo1316f = c17664i.mo1316f();
                    i12 = c17664i.f56454Z;
                    if (iMo1316f != i12) {
                        throw new IllegalStateException("ring buffer is full");
                    }
                    int i18 = c17664i.f56455o0;
                    int i19 = c17664i.f56456p0;
                    objArr = c17664i.f56453Y;
                    objArr[(i18 + i19) % i12] = next2;
                    c17664i.f56456p0 = i19 + 1;
                    if (c17664i.mo1316f() != i12) {
                        if (c17664i.f56456p0 < i16) {
                            ArrayList arrayList2 = new ArrayList(c17664i);
                            this.f56461r0 = c21030k;
                            this.f56457Z = c17664i;
                            this.f56458o0 = it;
                            this.f56460q0 = 3;
                            c21030k.m21482c(arrayList2, this);
                            EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                            return enumC19250a;
                        }
                        i13 = i12 + (i12 >> 1) + 1;
                        if (i13 > i16) {
                            i13 = i16;
                        }
                        if (c17664i.f56455o0 == 0) {
                            array = Arrays.copyOf(objArr, i13);
                            AbstractC16544l.m18093f(array, "copyOf(...)");
                        } else {
                            array = c17664i.toArray(new Object[i13]);
                        }
                        c17664i = new C17664I(c17664i.f56456p0, array);
                    }
                }
                c17664i2 = c17664i;
                c21030k3 = c21030k;
                if (c17664i2.f56456p0 > i15) {
                    ArrayList arrayList3 = new ArrayList(c17664i2);
                    this.f56461r0 = c21030k3;
                    this.f56457Z = c17664i2;
                    this.f56458o0 = null;
                    this.f56460q0 = 4;
                    c21030k3.m21482c(arrayList3, this);
                    EnumC19250a enumC19250a5 = EnumC19250a.f61036Y;
                    return enumC19250a;
                }
                if (!c17664i2.isEmpty()) {
                    this.f56461r0 = null;
                    this.f56457Z = null;
                    this.f56458o0 = null;
                    this.f56460q0 = 5;
                    c21030k3.m21482c(c17664i2, this);
                    EnumC19250a enumC19250a6 = EnumC19250a.f61036Y;
                    return enumC19250a;
                }
            }
        } else if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    it = this.f56458o0;
                    c17664i = (C17664I) this.f56457Z;
                    c21030k = (C21030k) this.f56461r0;
                    AbstractC9233X.m9807c(obj);
                    c17664i.m19260j(i15);
                    while (it.hasNext()) {
                        next2 = it.next();
                        iMo1316f = c17664i.mo1316f();
                        i12 = c17664i.f56454Z;
                        if (iMo1316f != i12) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i110 = c17664i.f56455o0;
                        int i111 = c17664i.f56456p0;
                        objArr = c17664i.f56453Y;
                        objArr[(i110 + i111) % i12] = next2;
                        c17664i.f56456p0 = i111 + 1;
                        if (c17664i.mo1316f() != i12) {
                            if (c17664i.f56456p0 < i16) {
                                ArrayList arrayList4 = new ArrayList(c17664i);
                                this.f56461r0 = c21030k;
                                this.f56457Z = c17664i;
                                this.f56458o0 = it;
                                this.f56460q0 = 3;
                                c21030k.m21482c(arrayList4, this);
                                EnumC19250a enumC19250a7 = EnumC19250a.f61036Y;
                                return enumC19250a;
                            }
                            i13 = i12 + (i12 >> 1) + 1;
                            if (i13 > i16) {
                                i13 = i16;
                            }
                            if (c17664i.f56455o0 == 0) {
                                array = Arrays.copyOf(objArr, i13);
                                AbstractC16544l.m18093f(array, "copyOf(...)");
                            } else {
                                array = c17664i.toArray(new Object[i13]);
                            }
                            c17664i = new C17664I(c17664i.f56456p0, array);
                        }
                    }
                    c17664i2 = c17664i;
                    c21030k3 = c21030k;
                } else if (i14 == 4) {
                    c17664i2 = (C17664I) this.f56457Z;
                    c21030k3 = (C21030k) this.f56461r0;
                    AbstractC9233X.m9807c(obj);
                    c17664i2.m19260j(i15);
                } else if (i14 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (c17664i2.f56456p0 > i15) {
                    ArrayList arrayList5 = new ArrayList(c17664i2);
                    this.f56461r0 = c21030k3;
                    this.f56457Z = c17664i2;
                    this.f56458o0 = null;
                    this.f56460q0 = 4;
                    c21030k3.m21482c(arrayList5, this);
                    EnumC19250a enumC19250a8 = EnumC19250a.f61036Y;
                    return enumC19250a;
                }
                if (!c17664i2.isEmpty()) {
                    this.f56461r0 = null;
                    this.f56457Z = null;
                    this.f56458o0 = null;
                    this.f56460q0 = 5;
                    c21030k3.m21482c(c17664i2, this);
                    EnumC19250a enumC19250a9 = EnumC19250a.f61036Y;
                    return enumC19250a;
                }
            }
            AbstractC9233X.m9807c(obj);
        } else {
            i11 = this.f56459p0;
            it2 = this.f56458o0;
            c21030k2 = (C21030k) this.f56461r0;
            AbstractC9233X.m9807c(obj);
            arrayList = new ArrayList(i16);
            i10 = i11;
            while (it2.hasNext()) {
                next = it2.next();
                if (i11 > 0) {
                    i11--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i16) {
                        this.f56461r0 = c21030k2;
                        this.f56457Z = arrayList;
                        this.f56458o0 = it2;
                        this.f56459p0 = i10;
                        this.f56460q0 = 1;
                        c21030k2.m21482c(arrayList, this);
                        EnumC19250a enumC19250a10 = EnumC19250a.f61036Y;
                        return enumC19250a;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f56461r0 = null;
                this.f56457Z = null;
                this.f56458o0 = null;
                this.f56460q0 = 2;
                c21030k2.m21482c(arrayList, this);
                EnumC19250a enumC19250a11 = EnumC19250a.f61036Y;
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
