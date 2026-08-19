package p733eo;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: eo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C13454b extends AbstractC13455c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1436k f42590a;

    public C13454b(InterfaceC1436k interfaceC1436k) {
        this.f42590a = interfaceC1436k;
    }

    @Override // p733eo.AbstractC13455c
    /* JADX INFO: renamed from: a */
    public final KSerializer mo14978a(List typeArgumentsSerializers) {
        AbstractC16544l.m18094g(typeArgumentsSerializers, "typeArgumentsSerializers");
        return (KSerializer) this.f42590a.invoke(typeArgumentsSerializers);
    }
}
