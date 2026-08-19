package p817j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.concurrent.ConcurrentMap$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ConcurrentMap$EL {
    public static Object computeIfAbsent(ConcurrentMap concurrentMap, Object obj, Function function) {
        Object objApply;
        if (concurrentMap instanceof InterfaceC15703v) {
            return ((InterfaceC15703v) concurrentMap).computeIfAbsent(obj, function);
        }
        Objects.requireNonNull(function);
        Object objPutIfAbsent = concurrentMap.get(obj);
        return (objPutIfAbsent == null && (objApply = function.apply(obj)) != null && (objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply)) == null) ? objApply : objPutIfAbsent;
    }
}
