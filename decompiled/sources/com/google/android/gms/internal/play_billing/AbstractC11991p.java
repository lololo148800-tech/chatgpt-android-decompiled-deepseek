package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bb.AbstractC11330w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import p817j$.util.Objects;
import p817j$.util.function.BiConsumer$CC;
import p817j$.util.function.BiFunction$CC;
import p817j$.util.function.Function$CC;
import p817j$.util.stream.Collector;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11991p {

    /* JADX INFO: renamed from: a */
    public static final Collector f36311a;

    static {
        final int i10 = 0;
        final int i11 = 0;
        final int i12 = 1;
        final int i13 = 1;
        f36311a = Collector.CC.m17369of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i10) {
                    case 0:
                        return new C12023x();
                    case 1:
                        return new C11869F();
                    default:
                        return new C11863D();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((C12023x) obj).m12766g(obj2);
                        return;
                    case 1:
                        C11869F c11869f = (C11869F) obj;
                        c11869f.getClass();
                        obj2.getClass();
                        c11869f.m12766g(obj2);
                        return;
                    default:
                        C11863D c11863d = (C11863D) obj;
                        C11899P c11899p = (C11899P) obj2;
                        c11863d.getClass();
                        if (c11899p.f36169Y.equals(c11899p.f36170Z)) {
                            throw new IllegalArgumentException(AbstractC11957g1.m13445g("range must not be empty, but was %s", c11899p));
                        }
                        c11863d.f36117a.add(c11899p);
                        return;
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i14 = i11;
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i14 = i12;
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        C11863D c11863d = (C11863D) obj;
                        c11863d.getClass();
                        for (C11899P c11899p : ((C11863D) obj2).f36117a) {
                            if (c11899p.f36169Y.equals(c11899p.f36170Z)) {
                                throw new IllegalArgumentException(AbstractC11957g1.m13445g("range must not be empty, but was %s", c11899p));
                            }
                            c11863d.f36117a.add(c11899p);
                        }
                        return c11863d;
                    case 1:
                        C12023x c12023x = (C12023x) obj;
                        C12023x c12023x2 = (C12023x) obj2;
                        Object[] objArr = (Object[]) c12023x2.f34260a;
                        int i14 = c12023x2.f34261b;
                        for (int i15 = 0; i15 < i14; i15++) {
                            c12023x.getClass();
                            if (objArr[i15] == null) {
                                throw new NullPointerException(AbstractC10763a.m11048f(i15, "at index "));
                            }
                        }
                        c12023x.m12767i(i14);
                        System.arraycopy(objArr, 0, (Object[]) c12023x.f34260a, c12023x.f34261b, i14);
                        c12023x.f34261b += i14;
                        return c12023x;
                    default:
                        C11869F c11869f = (C11869F) obj;
                        C11869F c11869f2 = (C11869F) obj2;
                        Object[] objArr2 = (Object[]) c11869f2.f34260a;
                        int i16 = c11869f2.f34261b;
                        for (int i17 = 0; i17 < i16; i17++) {
                            c11869f.getClass();
                            if (objArr2[i17] == null) {
                                throw new NullPointerException(AbstractC10763a.m11048f(i17, "at index "));
                            }
                        }
                        c11869f.m12767i(i16);
                        System.arraycopy(objArr2, 0, (Object[]) c11869f.f34260a, c11869f.f34261b, i16);
                        c11869f.f34261b += i16;
                        return c11869f;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            public final /* synthetic */ Function andThen(Function function) {
                int i14 = i13;
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Code duplicated, block: B:101:0x013e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:71:0x013a  */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int length;
                int iM12761h;
                C11899P c11899p;
                switch (i13) {
                    case 0:
                        ArrayList arrayList = ((C11863D) obj).f36117a;
                        int size = arrayList.size();
                        AbstractC11957g1.m13448j(size, "initialCapacity");
                        Object[] objArrCopyOf = new Object[size];
                        Collections.sort(arrayList, C11896O.f36167Y);
                        Iterator it = arrayList.iterator();
                        C11878I c11878i = it instanceof C11878I ? (C11878I) it : new C11878I(it);
                        int i14 = 0;
                        while (c11878i.hasNext()) {
                            C11899P c11899p2 = (C11899P) c11878i.next();
                            while (c11878i.hasNext()) {
                                if (!c11878i.f36142Z) {
                                    c11878i.f36143o0 = c11878i.f36141Y.next();
                                    c11878i.f36142Z = true;
                                }
                                C11899P c11899p3 = (C11899P) c11878i.f36143o0;
                                if (c11899p2.f36169Y.mo13527a(c11899p3.f36170Z) <= 0) {
                                    AbstractC12015v abstractC12015v = c11899p3.f36169Y;
                                    AbstractC12015v abstractC12015v2 = c11899p2.f36170Z;
                                    if (abstractC12015v.mo13527a(abstractC12015v2) <= 0) {
                                        AbstractC12015v abstractC12015v3 = c11899p2.f36169Y;
                                        int iMo13527a = abstractC12015v3.mo13527a(abstractC12015v);
                                        AbstractC12015v abstractC12015v4 = c11899p3.f36170Z;
                                        int iMo13527a2 = abstractC12015v2.mo13527a(abstractC12015v4);
                                        if (iMo13527a >= 0 && iMo13527a2 <= 0) {
                                            c11899p = c11899p2;
                                        } else if (iMo13527a > 0 || iMo13527a2 < 0) {
                                            if (iMo13527a >= 0) {
                                                abstractC12015v = abstractC12015v3;
                                            }
                                            if (iMo13527a2 <= 0) {
                                                abstractC12015v4 = abstractC12015v2;
                                            }
                                            if (!(abstractC12015v.mo13527a(abstractC12015v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC11957g1.m13445g("intersection is undefined for disconnected ranges %s and %s", c11899p2, c11899p3));
                                            }
                                            c11899p = new C11899P(abstractC12015v, abstractC12015v4);
                                        } else {
                                            c11899p = c11899p3;
                                        }
                                        if (!c11899p.f36169Y.equals(c11899p.f36170Z)) {
                                            throw new IllegalArgumentException(AbstractC11957g1.m13445g("Overlapping ranges not permitted but found %s overlapping %s", c11899p2, c11899p3));
                                        }
                                        C11899P c11899p4 = (C11899P) c11878i.next();
                                        int iMo13527a3 = abstractC12015v3.mo13527a(c11899p4.f36169Y);
                                        int iMo13527a4 = abstractC12015v2.mo13527a(c11899p4.f36170Z);
                                        if (iMo13527a3 > 0 || iMo13527a4 < 0) {
                                            if (iMo13527a3 < 0 || iMo13527a4 > 0) {
                                                if (iMo13527a3 > 0) {
                                                    abstractC12015v3 = c11899p4.f36169Y;
                                                }
                                                if (iMo13527a4 < 0) {
                                                    c11899p2 = c11899p4;
                                                }
                                                c11899p4 = new C11899P(abstractC12015v3, c11899p2.f36170Z);
                                            }
                                            c11899p2 = c11899p4;
                                        }
                                    }
                                }
                                c11899p2.getClass();
                                length = objArrCopyOf.length;
                                int i15 = i14 + 1;
                                iM12761h = AbstractC11330w.m12761h(length, i15);
                                if (iM12761h <= length) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM12761h);
                                }
                                objArrCopyOf[i14] = c11899p2;
                                i14 = i15;
                            }
                            c11899p2.getClass();
                            length = objArrCopyOf.length;
                            int i16 = i14 + 1;
                            iM12761h = AbstractC11330w.m12761h(length, i16);
                            if (iM12761h <= length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM12761h);
                            }
                            objArrCopyOf[i14] = c11899p2;
                            i14 = i16;
                        }
                        C11907S c11907sM13221t = AbstractC11857B.m13221t(i14, objArrCopyOf);
                        if (c11907sM13221t.isEmpty()) {
                            return C11866E.f36120Z;
                        }
                        if (c11907sM13221t.f36190p0 == 1) {
                            C12027y c12027yListIterator = c11907sM13221t.listIterator(0);
                            Object next = c12027yListIterator.next();
                            if (c12027yListIterator.hasNext()) {
                                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                                sb2.append(next);
                                for (int i17 = 0; i17 < 4 && c12027yListIterator.hasNext(); i17++) {
                                    sb2.append(", ");
                                    sb2.append(c12027yListIterator.next());
                                }
                                if (c12027yListIterator.hasNext()) {
                                    sb2.append(", ...");
                                }
                                sb2.append('>');
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            if (((C11899P) next).equals(C11899P.f36168o0)) {
                                return C11866E.f36121o0;
                            }
                        }
                        return new C11866E(c11907sM13221t);
                    case 1:
                        C12023x c12023x = (C12023x) obj;
                        c12023x.f34262c = true;
                        return AbstractC11857B.m13221t(c12023x.f34261b, (Object[]) c12023x.f34260a);
                    default:
                        C11869F c11869f = (C11869F) obj;
                        int i18 = c11869f.f34261b;
                        if (i18 == 0) {
                            return C11925Y.f36218u0;
                        }
                        if (i18 == 1) {
                            Object obj2 = ((Object[]) c11869f.f34260a)[0];
                            Objects.requireNonNull(obj2);
                            return new C11932a0(obj2);
                        }
                        AbstractC11872G abstractC11872GM13264t = AbstractC11872G.m13264t(i18, (Object[]) c11869f.f34260a);
                        c11869f.f34261b = abstractC11872GM13264t.size();
                        c11869f.f34262c = true;
                        return abstractC11872GM13264t;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                int i14 = i13;
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
        final int i14 = 1;
        final int i15 = 1;
        final int i16 = 2;
        final int i17 = 2;
        Collector.CC.m17369of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i14) {
                    case 0:
                        return new C12023x();
                    case 1:
                        return new C11869F();
                    default:
                        return new C11863D();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i15) {
                    case 0:
                        ((C12023x) obj).m12766g(obj2);
                        return;
                    case 1:
                        C11869F c11869f = (C11869F) obj;
                        c11869f.getClass();
                        obj2.getClass();
                        c11869f.m12766g(obj2);
                        return;
                    default:
                        C11863D c11863d = (C11863D) obj;
                        C11899P c11899p = (C11899P) obj2;
                        c11863d.getClass();
                        if (c11899p.f36169Y.equals(c11899p.f36170Z)) {
                            throw new IllegalArgumentException(AbstractC11957g1.m13445g("range must not be empty, but was %s", c11899p));
                        }
                        c11863d.f36117a.add(c11899p);
                        return;
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i18 = i15;
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i18 = i16;
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i16) {
                    case 0:
                        C11863D c11863d = (C11863D) obj;
                        c11863d.getClass();
                        for (C11899P c11899p : ((C11863D) obj2).f36117a) {
                            if (c11899p.f36169Y.equals(c11899p.f36170Z)) {
                                throw new IllegalArgumentException(AbstractC11957g1.m13445g("range must not be empty, but was %s", c11899p));
                            }
                            c11863d.f36117a.add(c11899p);
                        }
                        return c11863d;
                    case 1:
                        C12023x c12023x = (C12023x) obj;
                        C12023x c12023x2 = (C12023x) obj2;
                        Object[] objArr = (Object[]) c12023x2.f34260a;
                        int i18 = c12023x2.f34261b;
                        for (int i19 = 0; i19 < i18; i19++) {
                            c12023x.getClass();
                            if (objArr[i19] == null) {
                                throw new NullPointerException(AbstractC10763a.m11048f(i19, "at index "));
                            }
                        }
                        c12023x.m12767i(i18);
                        System.arraycopy(objArr, 0, (Object[]) c12023x.f34260a, c12023x.f34261b, i18);
                        c12023x.f34261b += i18;
                        return c12023x;
                    default:
                        C11869F c11869f = (C11869F) obj;
                        C11869F c11869f2 = (C11869F) obj2;
                        Object[] objArr2 = (Object[]) c11869f2.f34260a;
                        int i110 = c11869f2.f34261b;
                        for (int i111 = 0; i111 < i110; i111++) {
                            c11869f.getClass();
                            if (objArr2[i111] == null) {
                                throw new NullPointerException(AbstractC10763a.m11048f(i111, "at index "));
                            }
                        }
                        c11869f.m12767i(i110);
                        System.arraycopy(objArr2, 0, (Object[]) c11869f.f34260a, c11869f.f34261b, i110);
                        c11869f.f34261b += i110;
                        return c11869f;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            public final /* synthetic */ Function andThen(Function function) {
                int i18 = i17;
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Code duplicated, block: B:101:0x013e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:71:0x013a  */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int length;
                int iM12761h;
                C11899P c11899p;
                switch (i17) {
                    case 0:
                        ArrayList arrayList = ((C11863D) obj).f36117a;
                        int size = arrayList.size();
                        AbstractC11957g1.m13448j(size, "initialCapacity");
                        Object[] objArrCopyOf = new Object[size];
                        Collections.sort(arrayList, C11896O.f36167Y);
                        Iterator it = arrayList.iterator();
                        C11878I c11878i = it instanceof C11878I ? (C11878I) it : new C11878I(it);
                        int i18 = 0;
                        while (c11878i.hasNext()) {
                            C11899P c11899p2 = (C11899P) c11878i.next();
                            while (c11878i.hasNext()) {
                                if (!c11878i.f36142Z) {
                                    c11878i.f36143o0 = c11878i.f36141Y.next();
                                    c11878i.f36142Z = true;
                                }
                                C11899P c11899p3 = (C11899P) c11878i.f36143o0;
                                if (c11899p2.f36169Y.mo13527a(c11899p3.f36170Z) <= 0) {
                                    AbstractC12015v abstractC12015v = c11899p3.f36169Y;
                                    AbstractC12015v abstractC12015v2 = c11899p2.f36170Z;
                                    if (abstractC12015v.mo13527a(abstractC12015v2) <= 0) {
                                        AbstractC12015v abstractC12015v3 = c11899p2.f36169Y;
                                        int iMo13527a = abstractC12015v3.mo13527a(abstractC12015v);
                                        AbstractC12015v abstractC12015v4 = c11899p3.f36170Z;
                                        int iMo13527a2 = abstractC12015v2.mo13527a(abstractC12015v4);
                                        if (iMo13527a >= 0 && iMo13527a2 <= 0) {
                                            c11899p = c11899p2;
                                        } else if (iMo13527a > 0 || iMo13527a2 < 0) {
                                            if (iMo13527a >= 0) {
                                                abstractC12015v = abstractC12015v3;
                                            }
                                            if (iMo13527a2 <= 0) {
                                                abstractC12015v4 = abstractC12015v2;
                                            }
                                            if (!(abstractC12015v.mo13527a(abstractC12015v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC11957g1.m13445g("intersection is undefined for disconnected ranges %s and %s", c11899p2, c11899p3));
                                            }
                                            c11899p = new C11899P(abstractC12015v, abstractC12015v4);
                                        } else {
                                            c11899p = c11899p3;
                                        }
                                        if (!c11899p.f36169Y.equals(c11899p.f36170Z)) {
                                            throw new IllegalArgumentException(AbstractC11957g1.m13445g("Overlapping ranges not permitted but found %s overlapping %s", c11899p2, c11899p3));
                                        }
                                        C11899P c11899p4 = (C11899P) c11878i.next();
                                        int iMo13527a3 = abstractC12015v3.mo13527a(c11899p4.f36169Y);
                                        int iMo13527a4 = abstractC12015v2.mo13527a(c11899p4.f36170Z);
                                        if (iMo13527a3 > 0 || iMo13527a4 < 0) {
                                            if (iMo13527a3 < 0 || iMo13527a4 > 0) {
                                                if (iMo13527a3 > 0) {
                                                    abstractC12015v3 = c11899p4.f36169Y;
                                                }
                                                if (iMo13527a4 < 0) {
                                                    c11899p2 = c11899p4;
                                                }
                                                c11899p4 = new C11899P(abstractC12015v3, c11899p2.f36170Z);
                                            }
                                            c11899p2 = c11899p4;
                                        }
                                    }
                                }
                                c11899p2.getClass();
                                length = objArrCopyOf.length;
                                int i19 = i18 + 1;
                                iM12761h = AbstractC11330w.m12761h(length, i19);
                                if (iM12761h <= length) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM12761h);
                                }
                                objArrCopyOf[i18] = c11899p2;
                                i18 = i19;
                            }
                            c11899p2.getClass();
                            length = objArrCopyOf.length;
                            int i110 = i18 + 1;
                            iM12761h = AbstractC11330w.m12761h(length, i110);
                            if (iM12761h <= length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM12761h);
                            }
                            objArrCopyOf[i18] = c11899p2;
                            i18 = i110;
                        }
                        C11907S c11907sM13221t = AbstractC11857B.m13221t(i18, objArrCopyOf);
                        if (c11907sM13221t.isEmpty()) {
                            return C11866E.f36120Z;
                        }
                        if (c11907sM13221t.f36190p0 == 1) {
                            C12027y c12027yListIterator = c11907sM13221t.listIterator(0);
                            Object next = c12027yListIterator.next();
                            if (c12027yListIterator.hasNext()) {
                                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                                sb2.append(next);
                                for (int i111 = 0; i111 < 4 && c12027yListIterator.hasNext(); i111++) {
                                    sb2.append(", ");
                                    sb2.append(c12027yListIterator.next());
                                }
                                if (c12027yListIterator.hasNext()) {
                                    sb2.append(", ...");
                                }
                                sb2.append('>');
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            if (((C11899P) next).equals(C11899P.f36168o0)) {
                                return C11866E.f36121o0;
                            }
                        }
                        return new C11866E(c11907sM13221t);
                    case 1:
                        C12023x c12023x = (C12023x) obj;
                        c12023x.f34262c = true;
                        return AbstractC11857B.m13221t(c12023x.f34261b, (Object[]) c12023x.f34260a);
                    default:
                        C11869F c11869f = (C11869F) obj;
                        int i112 = c11869f.f34261b;
                        if (i112 == 0) {
                            return C11925Y.f36218u0;
                        }
                        if (i112 == 1) {
                            Object obj2 = ((Object[]) c11869f.f34260a)[0];
                            Objects.requireNonNull(obj2);
                            return new C11932a0(obj2);
                        }
                        AbstractC11872G abstractC11872GM13264t = AbstractC11872G.m13264t(i112, (Object[]) c11869f.f34260a);
                        c11869f.f34261b = abstractC11872GM13264t.size();
                        c11869f.f34262c = true;
                        return abstractC11872GM13264t;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                int i18 = i17;
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
        final int i18 = 2;
        final int i19 = 2;
        final int i20 = 0;
        final int i21 = 0;
        Collector.CC.m17369of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.l
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i18) {
                    case 0:
                        return new C12023x();
                    case 1:
                        return new C11869F();
                    default:
                        return new C11863D();
                }
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i19) {
                    case 0:
                        ((C12023x) obj).m12766g(obj2);
                        return;
                    case 1:
                        C11869F c11869f = (C11869F) obj;
                        c11869f.getClass();
                        obj2.getClass();
                        c11869f.m12766g(obj2);
                        return;
                    default:
                        C11863D c11863d = (C11863D) obj;
                        C11899P c11899p = (C11899P) obj2;
                        c11863d.getClass();
                        if (c11899p.f36169Y.equals(c11899p.f36170Z)) {
                            throw new IllegalArgumentException(AbstractC11957g1.m13445g("range must not be empty, but was %s", c11899p));
                        }
                        c11863d.f36117a.add(c11899p);
                        return;
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i110 = i19;
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.m
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i110 = i20;
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i20) {
                    case 0:
                        C11863D c11863d = (C11863D) obj;
                        c11863d.getClass();
                        for (C11899P c11899p : ((C11863D) obj2).f36117a) {
                            if (c11899p.f36169Y.equals(c11899p.f36170Z)) {
                                throw new IllegalArgumentException(AbstractC11957g1.m13445g("range must not be empty, but was %s", c11899p));
                            }
                            c11863d.f36117a.add(c11899p);
                        }
                        return c11863d;
                    case 1:
                        C12023x c12023x = (C12023x) obj;
                        C12023x c12023x2 = (C12023x) obj2;
                        Object[] objArr = (Object[]) c12023x2.f34260a;
                        int i110 = c12023x2.f34261b;
                        for (int i111 = 0; i111 < i110; i111++) {
                            c12023x.getClass();
                            if (objArr[i111] == null) {
                                throw new NullPointerException(AbstractC10763a.m11048f(i111, "at index "));
                            }
                        }
                        c12023x.m12767i(i110);
                        System.arraycopy(objArr, 0, (Object[]) c12023x.f34260a, c12023x.f34261b, i110);
                        c12023x.f34261b += i110;
                        return c12023x;
                    default:
                        C11869F c11869f = (C11869F) obj;
                        C11869F c11869f2 = (C11869F) obj2;
                        Object[] objArr2 = (Object[]) c11869f2.f34260a;
                        int i112 = c11869f2.f34261b;
                        for (int i113 = 0; i113 < i112; i113++) {
                            c11869f.getClass();
                            if (objArr2[i113] == null) {
                                throw new NullPointerException(AbstractC10763a.m11048f(i113, "at index "));
                            }
                        }
                        c11869f.m12767i(i112);
                        System.arraycopy(objArr2, 0, (Object[]) c11869f.f34260a, c11869f.f34261b, i112);
                        c11869f.f34261b += i112;
                        return c11869f;
                }
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.n
            public final /* synthetic */ Function andThen(Function function) {
                int i110 = i21;
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Code duplicated, block: B:101:0x013e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:71:0x013a  */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int length;
                int iM12761h;
                C11899P c11899p;
                switch (i21) {
                    case 0:
                        ArrayList arrayList = ((C11863D) obj).f36117a;
                        int size = arrayList.size();
                        AbstractC11957g1.m13448j(size, "initialCapacity");
                        Object[] objArrCopyOf = new Object[size];
                        Collections.sort(arrayList, C11896O.f36167Y);
                        Iterator it = arrayList.iterator();
                        C11878I c11878i = it instanceof C11878I ? (C11878I) it : new C11878I(it);
                        int i110 = 0;
                        while (c11878i.hasNext()) {
                            C11899P c11899p2 = (C11899P) c11878i.next();
                            while (c11878i.hasNext()) {
                                if (!c11878i.f36142Z) {
                                    c11878i.f36143o0 = c11878i.f36141Y.next();
                                    c11878i.f36142Z = true;
                                }
                                C11899P c11899p3 = (C11899P) c11878i.f36143o0;
                                if (c11899p2.f36169Y.mo13527a(c11899p3.f36170Z) <= 0) {
                                    AbstractC12015v abstractC12015v = c11899p3.f36169Y;
                                    AbstractC12015v abstractC12015v2 = c11899p2.f36170Z;
                                    if (abstractC12015v.mo13527a(abstractC12015v2) <= 0) {
                                        AbstractC12015v abstractC12015v3 = c11899p2.f36169Y;
                                        int iMo13527a = abstractC12015v3.mo13527a(abstractC12015v);
                                        AbstractC12015v abstractC12015v4 = c11899p3.f36170Z;
                                        int iMo13527a2 = abstractC12015v2.mo13527a(abstractC12015v4);
                                        if (iMo13527a >= 0 && iMo13527a2 <= 0) {
                                            c11899p = c11899p2;
                                        } else if (iMo13527a > 0 || iMo13527a2 < 0) {
                                            if (iMo13527a >= 0) {
                                                abstractC12015v = abstractC12015v3;
                                            }
                                            if (iMo13527a2 <= 0) {
                                                abstractC12015v4 = abstractC12015v2;
                                            }
                                            if (!(abstractC12015v.mo13527a(abstractC12015v4) <= 0)) {
                                                throw new IllegalArgumentException(AbstractC11957g1.m13445g("intersection is undefined for disconnected ranges %s and %s", c11899p2, c11899p3));
                                            }
                                            c11899p = new C11899P(abstractC12015v, abstractC12015v4);
                                        } else {
                                            c11899p = c11899p3;
                                        }
                                        if (!c11899p.f36169Y.equals(c11899p.f36170Z)) {
                                            throw new IllegalArgumentException(AbstractC11957g1.m13445g("Overlapping ranges not permitted but found %s overlapping %s", c11899p2, c11899p3));
                                        }
                                        C11899P c11899p4 = (C11899P) c11878i.next();
                                        int iMo13527a3 = abstractC12015v3.mo13527a(c11899p4.f36169Y);
                                        int iMo13527a4 = abstractC12015v2.mo13527a(c11899p4.f36170Z);
                                        if (iMo13527a3 > 0 || iMo13527a4 < 0) {
                                            if (iMo13527a3 < 0 || iMo13527a4 > 0) {
                                                if (iMo13527a3 > 0) {
                                                    abstractC12015v3 = c11899p4.f36169Y;
                                                }
                                                if (iMo13527a4 < 0) {
                                                    c11899p2 = c11899p4;
                                                }
                                                c11899p4 = new C11899P(abstractC12015v3, c11899p2.f36170Z);
                                            }
                                            c11899p2 = c11899p4;
                                        }
                                    }
                                }
                                c11899p2.getClass();
                                length = objArrCopyOf.length;
                                int i111 = i110 + 1;
                                iM12761h = AbstractC11330w.m12761h(length, i111);
                                if (iM12761h <= length) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM12761h);
                                }
                                objArrCopyOf[i110] = c11899p2;
                                i110 = i111;
                            }
                            c11899p2.getClass();
                            length = objArrCopyOf.length;
                            int i112 = i110 + 1;
                            iM12761h = AbstractC11330w.m12761h(length, i112);
                            if (iM12761h <= length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM12761h);
                            }
                            objArrCopyOf[i110] = c11899p2;
                            i110 = i112;
                        }
                        C11907S c11907sM13221t = AbstractC11857B.m13221t(i110, objArrCopyOf);
                        if (c11907sM13221t.isEmpty()) {
                            return C11866E.f36120Z;
                        }
                        if (c11907sM13221t.f36190p0 == 1) {
                            C12027y c12027yListIterator = c11907sM13221t.listIterator(0);
                            Object next = c12027yListIterator.next();
                            if (c12027yListIterator.hasNext()) {
                                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                                sb2.append(next);
                                for (int i113 = 0; i113 < 4 && c12027yListIterator.hasNext(); i113++) {
                                    sb2.append(", ");
                                    sb2.append(c12027yListIterator.next());
                                }
                                if (c12027yListIterator.hasNext()) {
                                    sb2.append(", ...");
                                }
                                sb2.append('>');
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            if (((C11899P) next).equals(C11899P.f36168o0)) {
                                return C11866E.f36121o0;
                            }
                        }
                        return new C11866E(c11907sM13221t);
                    case 1:
                        C12023x c12023x = (C12023x) obj;
                        c12023x.f34262c = true;
                        return AbstractC11857B.m13221t(c12023x.f34261b, (Object[]) c12023x.f34260a);
                    default:
                        C11869F c11869f = (C11869F) obj;
                        int i114 = c11869f.f34261b;
                        if (i114 == 0) {
                            return C11925Y.f36218u0;
                        }
                        if (i114 == 1) {
                            Object obj2 = ((Object[]) c11869f.f34260a)[0];
                            Objects.requireNonNull(obj2);
                            return new C11932a0(obj2);
                        }
                        AbstractC11872G abstractC11872GM13264t = AbstractC11872G.m13264t(i114, (Object[]) c11869f.f34260a);
                        c11869f.f34261b = abstractC11872GM13264t.size();
                        c11869f.f34262c = true;
                        return abstractC11872GM13264t;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                int i110 = i21;
                return Function$CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
    }
}
