package p534Vm;

import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17660E;

/* JADX INFO: renamed from: Vm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8402c implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public static final C8402c f26130Y = new C8402c();

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        InterfaceC3776x[] interfaceC3776xArr = JavaDeprecatedAnnotationDescriptor.f51812h;
        return AbstractC17660E.m19258c(new C17309l(JavaAnnotationMapper.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm(), new StringValue("Deprecated in Java")));
    }
}
