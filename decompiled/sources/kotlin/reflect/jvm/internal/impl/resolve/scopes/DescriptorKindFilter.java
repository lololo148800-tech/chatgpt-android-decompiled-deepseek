package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorKindFilter {
    public static final DescriptorKindFilter ALL;
    public static final DescriptorKindFilter CALLABLES;
    public static final DescriptorKindFilter CLASSIFIERS;
    public static final Companion Companion;
    public static final DescriptorKindFilter FUNCTIONS;
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;
    public static final DescriptorKindFilter PACKAGES;
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;
    public static final DescriptorKindFilter TYPE_ALIASES;
    public static final DescriptorKindFilter VALUES;
    public static final DescriptorKindFilter VARIABLES;

    /* JADX INFO: renamed from: c */
    public static int f52917c;

    /* JADX INFO: renamed from: d */
    public static final int f52918d;

    /* JADX INFO: renamed from: e */
    public static final int f52919e;

    /* JADX INFO: renamed from: f */
    public static final int f52920f;

    /* JADX INFO: renamed from: g */
    public static final int f52921g;

    /* JADX INFO: renamed from: h */
    public static final int f52922h;

    /* JADX INFO: renamed from: i */
    public static final int f52923i;

    /* JADX INFO: renamed from: j */
    public static final int f52924j;

    /* JADX INFO: renamed from: k */
    public static final int f52925k;

    /* JADX INFO: renamed from: l */
    public static final ArrayList f52926l;

    /* JADX INFO: renamed from: m */
    public static final ArrayList f52927m;

    /* JADX INFO: renamed from: a */
    public final List f52928a;

    /* JADX INFO: renamed from: b */
    public final int f52929b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final int access$nextMask(Companion companion) {
            companion.getClass();
            int i10 = DescriptorKindFilter.f52917c;
            DescriptorKindFilter.f52917c <<= 1;
            return i10;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.f52924j;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.f52925k;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.f52922h;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.f52918d;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.f52921g;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.f52919e;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.f52920f;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.f52923i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C16624a c16624a;
        C16624a c16624a2;
        Companion companion = new Companion(null);
        Companion = companion;
        f52917c = 1;
        int iAccess$nextMask = Companion.access$nextMask(companion);
        f52918d = iAccess$nextMask;
        int iAccess$nextMask2 = Companion.access$nextMask(companion);
        f52919e = iAccess$nextMask2;
        int iAccess$nextMask3 = Companion.access$nextMask(companion);
        f52920f = iAccess$nextMask3;
        int iAccess$nextMask4 = Companion.access$nextMask(companion);
        f52921g = iAccess$nextMask4;
        int iAccess$nextMask5 = Companion.access$nextMask(companion);
        f52922h = iAccess$nextMask5;
        int iAccess$nextMask6 = Companion.access$nextMask(companion);
        f52923i = iAccess$nextMask6;
        int iAccess$nextMask7 = Companion.access$nextMask(companion) - 1;
        f52924j = iAccess$nextMask7;
        int i10 = iAccess$nextMask | iAccess$nextMask2 | iAccess$nextMask3;
        f52925k = i10;
        int i11 = 2;
        ALL = new DescriptorKindFilter(iAccess$nextMask7, null, i11, 0 == true ? 1 : 0);
        CALLABLES = new DescriptorKindFilter(iAccess$nextMask5 | iAccess$nextMask6, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iAccess$nextMask, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iAccess$nextMask2, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        TYPE_ALIASES = new DescriptorKindFilter(iAccess$nextMask3, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        CLASSIFIERS = new DescriptorKindFilter(i10, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        PACKAGES = new DescriptorKindFilter(iAccess$nextMask4, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        FUNCTIONS = new DescriptorKindFilter(iAccess$nextMask5, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        VARIABLES = new DescriptorKindFilter(iAccess$nextMask6, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        VALUES = new DescriptorKindFilter(iAccess$nextMask2 | iAccess$nextMask5 | iAccess$nextMask6, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        Field[] fields = DescriptorKindFilter.class.getFields();
        AbstractC16544l.m18093f(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                String name = field2.getName();
                AbstractC16544l.m18093f(name, "getName(...)");
                c16624a2 = new C16624a(descriptorKindFilter.f52929b, name);
            } else {
                c16624a2 = null;
            }
            if (c16624a2 != null) {
                arrayList2.add(c16624a2);
            }
        }
        f52926l = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        AbstractC16544l.m18093f(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC16544l.m18089b(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                AbstractC16544l.m18093f(name2, "getName(...)");
                c16624a = new C16624a(iIntValue, name2);
            } else {
                c16624a = null;
            }
            if (c16624a != null) {
                arrayList5.add(c16624a);
            }
        }
        f52927m = arrayList5;
    }

    public DescriptorKindFilter(int i10, List<? extends DescriptorKindExclude> excludes) {
        AbstractC16544l.m18094g(excludes, "excludes");
        this.f52928a = excludes;
        Iterator<T> it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((DescriptorKindExclude) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.f52929b = i10;
    }

    public final boolean acceptsKinds(int i10) {
        return (i10 & this.f52929b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DescriptorKindFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return AbstractC16544l.m18089b(this.f52928a, descriptorKindFilter.f52928a) && this.f52929b == descriptorKindFilter.f52929b;
    }

    public final List<DescriptorKindExclude> getExcludes() {
        return this.f52928a;
    }

    public final int getKindMask() {
        return this.f52929b;
    }

    public int hashCode() {
        return (this.f52928a.hashCode() * 31) + this.f52929b;
    }

    public final DescriptorKindFilter restrictedToKindsOrNull(int i10) {
        int i11 = i10 & this.f52929b;
        if (i11 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i11, this.f52928a);
    }

    public String toString() {
        Object next;
        Iterator it = f52926l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C16624a) next).f52948a != this.f52929b);
        C16624a c16624a = (C16624a) next;
        String strM19349Y = c16624a != null ? c16624a.f52949b : null;
        if (strM19349Y == null) {
            ArrayList<C16624a> arrayList = f52927m;
            ArrayList arrayList2 = new ArrayList();
            for (C16624a c16624a2 : arrayList) {
                String str = acceptsKinds(c16624a2.f52948a) ? c16624a2.f52949b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strM19349Y = AbstractC17680n.m19349Y(arrayList2, " | ", null, null, 0, null, null, 62);
        }
        StringBuilder sbM11058p = AbstractC10763a.m11058p("DescriptorKindFilter(", strM19349Y, ", ");
        sbM11058p.append(this.f52928a);
        sbM11058p.append(')');
        return sbM11058p.toString();
    }

    public /* synthetic */ DescriptorKindFilter(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? C17689w.f56480Y : list);
    }
}
