package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p466T0.C7181h;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17674h;
import p909nm.AbstractC17678l;
import vn.C20648e;

/* JADX INFO: loaded from: classes2.dex */
public final class SmartSet<T> extends AbstractC17674h {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: Y */
    public Object f53312Y;

    /* JADX INFO: renamed from: Z */
    public int f53313Z;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }

        public final <T> SmartSet<T> create(Collection<? extends T> set) {
            AbstractC16544l.m18094g(set, "set");
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(set);
            return smartSet;
        }
    }

    public SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t10) {
        Object obj;
        if (size() == 0) {
            this.f53312Y = t10;
        } else if (size() == 1) {
            if (AbstractC16544l.m18089b(this.f53312Y, t10)) {
                return false;
            }
            this.f53312Y = new Object[]{this.f53312Y, t10};
        } else if (size() < 5) {
            Object obj2 = this.f53312Y;
            AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj2;
            if (AbstractC17678l.m19298e(t10, objArr)) {
                return false;
            }
            if (size() == 4) {
                Object[] elements = Arrays.copyOf(objArr, objArr.length);
                AbstractC16544l.m18094g(elements, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC17660E.m19257b(elements.length));
                AbstractC17678l.m19290M(elements, linkedHashSet);
                linkedHashSet.add(t10);
                obj = linkedHashSet;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = t10;
                obj = objArrCopyOf;
            }
            this.f53312Y = obj;
        } else {
            Object obj3 = this.f53312Y;
            AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!AbstractC16529F.m18080d(obj3).add(t10)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f53312Y = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC16544l.m18089b(this.f53312Y, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f53312Y;
            AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC17678l.m19298e(obj, (Object[]) obj2);
        }
        Object obj3 = this.f53312Y;
        AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // p909nm.AbstractC17674h
    public int getSize() {
        return this.f53313Z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new C20648e(this.f53312Y);
        }
        if (size() < 5) {
            Object obj = this.f53312Y;
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C7181h((Object[]) obj);
        }
        Object obj2 = this.f53312Y;
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return AbstractC16529F.m18080d(obj2).iterator();
    }

    public void setSize(int i10) {
        this.f53313Z = i10;
    }
}
