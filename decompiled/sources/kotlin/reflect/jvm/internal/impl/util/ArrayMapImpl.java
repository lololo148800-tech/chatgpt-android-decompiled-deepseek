package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p909nm.AbstractC17668b;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: Y */
    public Object[] f53281Y;

    /* JADX INFO: renamed from: Z */
    public int f53282Z;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ArrayMapImpl() {
        super(null);
        this.f53281Y = new Object[20];
        this.f53282Z = 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i10) {
        return (T) AbstractC17678l.m19278A(i10, this.f53281Y);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.f53282Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AbstractC17668b() { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1

            /* JADX INFO: renamed from: o0 */
            public int f53283o0 = -1;

            @Override // p909nm.AbstractC17668b
            /* JADX INFO: renamed from: a */
            public final void mo18444a() {
                ArrayMapImpl arrayMapImpl;
                do {
                    int i10 = this.f53283o0 + 1;
                    this.f53283o0 = i10;
                    arrayMapImpl = ArrayMapImpl.this;
                    if (i10 >= arrayMapImpl.f53281Y.length) {
                        break;
                    }
                } while (arrayMapImpl.f53281Y[this.f53283o0] == null);
                if (this.f53283o0 >= arrayMapImpl.f53281Y.length) {
                    this.f56465Y = 2;
                    return;
                }
                Object obj = arrayMapImpl.f53281Y[this.f53283o0];
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                this.f56466Z = obj;
                this.f56465Y = 1;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i10, T value) {
        AbstractC16544l.m18094g(value, "value");
        Object[] objArr = this.f53281Y;
        if (objArr.length <= i10) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i10);
            Object[] objArrCopyOf = Arrays.copyOf(this.f53281Y, length);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
            this.f53281Y = objArrCopyOf;
        }
        if (this.f53281Y[i10] == null) {
            this.f53282Z = getSize() + 1;
        }
        this.f53281Y[i10] = value;
    }
}
