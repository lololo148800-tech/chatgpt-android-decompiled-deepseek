package p436Rm;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p049Bm.InterfaceC1426a;
import p298Lm.C5140G;

/* JADX INFO: renamed from: Rm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6936b implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Name f22217Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractTypeParameterDescriptor f22218Z;

    public C6936b(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, Name name) {
        this.f22218Z = abstractTypeParameterDescriptor;
        this.f22217Y = name;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this.f22218Z.getTypeConstructor(), Collections.emptyList(), false, new LazyScopeAdapter(new C5140G(this, 11)));
    }
}
