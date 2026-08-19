package p060C6;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: C6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1611h extends AbstractC1604a {

    /* JADX INFO: renamed from: Y */
    public final Map f4487Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611h(String operationName, Map map) {
        super("Operation error ".concat(operationName), null);
        AbstractC16544l.m18094g(operationName, "operationName");
        this.f4487Y = map;
    }
}
