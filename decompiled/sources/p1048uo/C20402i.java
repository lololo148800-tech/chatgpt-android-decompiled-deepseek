package p1048uo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: uo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C20402i implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final ArrayList f64514a;

    /* JADX INFO: renamed from: b */
    public boolean f64515b;

    /* JADX INFO: renamed from: c */
    public String f64516c;

    public C20402i(ArrayList arrayList) {
        this.f64514a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        AbstractC16544l.m18094g(proxy, "proxy");
        AbstractC16544l.m18094g(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC16544l.m18089b(name, "supports") && AbstractC16544l.m18089b(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC16544l.m18089b(name, "unsupported") && AbstractC16544l.m18089b(Void.TYPE, returnType)) {
            this.f64515b = true;
            return null;
        }
        boolean zM18089b = AbstractC16544l.m18089b(name, "protocols");
        ArrayList arrayList = this.f64514a;
        if (zM18089b && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC16544l.m18089b(name, "selectProtocol") || AbstractC16544l.m18089b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj2 = list.get(i10);
                        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (arrayList.contains(str)) {
                            this.f64516c = str;
                            return str;
                        }
                        if (i10 != size) {
                            i10++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f64516c = str2;
                return str2;
            }
        }
        if ((!AbstractC16544l.m18089b(name, "protocolSelected") && !AbstractC16544l.m18089b(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f64516c = (String) obj3;
        return null;
    }
}
