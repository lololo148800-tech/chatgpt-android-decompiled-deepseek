package androidx.work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p114E8.C2354a;
import p444S4.AbstractC7003i;
import p444S4.C7001g;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "LS4/i;", "<init>", "()V", "work-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ArrayCreatingInputMerger extends AbstractC7003i {
    @Override // p444S4.AbstractC7003i
    /* JADX INFO: renamed from: a */
    public final C7001g mo7403a(ArrayList arrayList) throws Throwable {
        Object newArray;
        C2354a c2354a = new C2354a(1);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((C7001g) it.next()).f22408a);
            AbstractC16544l.m18093f(mapUnmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(key);
                AbstractC16544l.m18093f(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        AbstractC16544l.m18093f(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        AbstractC16544l.m18091d(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        AbstractC16544l.m18093f(newArray2, "newArray");
                        value = newArray2;
                    } else {
                        if (!AbstractC16544l.m18089b(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        AbstractC16544l.m18093f(newArray, "newArray");
                        value = newArray;
                    }
                } else if (!cls.isArray()) {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    AbstractC16544l.m18093f(newArray, "newArray");
                    value = newArray;
                }
                AbstractC16544l.m18093f(value, "if (existingValue == nul…      }\n                }");
                map.put(key, value);
            }
        }
        c2354a.m3441d(map);
        C7001g c7001g = new C7001g(c2354a.f7308b);
        C7001g.m7402b(c7001g);
        return c7001g;
    }
}
