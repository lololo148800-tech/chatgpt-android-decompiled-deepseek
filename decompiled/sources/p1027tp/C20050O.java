package p1027tp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import mo.C17349p;
import mo.InterfaceC17337d;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: tp.O */
/* JADX INFO: loaded from: classes2.dex */
public final class C20050O {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f63532a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final InterfaceC17337d f63533b;

    /* JADX INFO: renamed from: c */
    public final C17349p f63534c;

    /* JADX INFO: renamed from: d */
    public final List f63535d;

    /* JADX INFO: renamed from: e */
    public final List f63536e;

    /* JADX INFO: renamed from: f */
    public final Executor f63537f;

    public C20050O(InterfaceC17337d interfaceC17337d, C17349p c17349p, List list, List list2, Executor executor) {
        this.f63533b = interfaceC17337d;
        this.f63534c = c17349p;
        this.f63535d = list;
        this.f63536e = list2;
        this.f63537f = executor;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC20061e m20871a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f63536e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC20061e interfaceC20061eMo20896a = ((AbstractC20060d) list.get(i10)).mo20896a(type, annotationArr);
            if (interfaceC20061eMo20896a != null) {
                return interfaceC20061eMo20896a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC20060d) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: b */
    public final Object m20872b(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C20049N(this, cls));
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC20067k m20873c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f63535d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC20067k interfaceC20067kMo20891a = ((AbstractC20066j) list.get(i10)).mo20891a(type, annotationArr);
            if (interfaceC20067kMo20891a != null) {
                return interfaceC20067kMo20891a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC20066j) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC20067k m20874d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f63535d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC20067k interfaceC20067kMo20892b = ((AbstractC20066j) list.get(i10)).mo20892b(type, annotationArr, this);
            if (interfaceC20067kMo20892b != null) {
                return interfaceC20067kMo20892b;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC20066j) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: e */
    public final void m20875e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f63535d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC20066j) list.get(i10)).getClass();
        }
    }
}
