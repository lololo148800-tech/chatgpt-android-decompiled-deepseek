package kotlin.reflect.jvm.internal.impl.builtins.functions;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import mm.C17309l;
import p606Yn.C10107h;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17656A;
import p909nm.C17689w;
import p909nm.C17692z;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {
    public static final Factory Factory = new Factory(null);

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FunctionInvokeDescriptor create(FunctionClassDescriptor functionClass, boolean z6) {
            String lowerCase;
            AbstractC16544l.m18094g(functionClass, "functionClass");
            List<TypeParameterDescriptor> declaredTypeParameters = functionClass.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClass, null, CallableMemberDescriptor.Kind.DECLARATION, z6, null);
            ReceiverParameterDescriptor thisAsReceiverParameter = functionClass.getThisAsReceiverParameter();
            C17689w c17689w = C17689w.f56480Y;
            ArrayList arrayList = new ArrayList();
            for (Object obj : declaredTypeParameters) {
                if (((TypeParameterDescriptor) obj).getVariance() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            C10107h c10107hM19332I0 = AbstractC17680n.m19332I0(arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(c10107hM19332I0, 10));
            Iterator it = c10107hM19332I0.iterator();
            while (true) {
                C17656A c17656a = (C17656A) it;
                if (!c17656a.f56445Z.hasNext()) {
                    C17689w c17689w2 = c17689w;
                    functionInvokeDescriptor.initialize((ReceiverParameterDescriptor) null, thisAsReceiverParameter, (List<ReceiverParameterDescriptor>) c17689w2, (List<? extends TypeParameterDescriptor>) c17689w2, (List<ValueParameterDescriptor>) arrayList2, (KotlinType) ((TypeParameterDescriptor) AbstractC17680n.m19351a0(declaredTypeParameters)).getDefaultType(), Modality.ABSTRACT, DescriptorVisibilities.PUBLIC);
                    functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
                    return functionInvokeDescriptor;
                }
                C17692z c17692z = (C17692z) c17656a.next();
                Factory factory = FunctionInvokeDescriptor.Factory;
                int i10 = c17692z.f56483a;
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) c17692z.f56484b;
                factory.getClass();
                String strAsString = typeParameterDescriptor.getName().asString();
                AbstractC16544l.m18093f(strAsString, "asString(...)");
                if (strAsString.equals(TokenNames.f32019T)) {
                    lowerCase = "instance";
                } else if (strAsString.equals(TokenNames.f32010E)) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strAsString.toLowerCase(Locale.ROOT);
                    AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                }
                Annotations empty = Annotations.Companion.getEMPTY();
                Name nameIdentifier = Name.identifier(lowerCase);
                AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
                SimpleType defaultType = typeParameterDescriptor.getDefaultType();
                AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
                SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
                AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
                C17689w c17689w3 = c17689w;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i10, empty, nameIdentifier, defaultType, false, false, false, null, NO_SOURCE));
                arrayList2 = arrayList3;
                c17689w = c17689w3;
            }
        }
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: b */
    public final FunctionDescriptorImpl mo18116b(FunctionDescriptorImpl.CopyConfiguration configuration) {
        Name name;
        AbstractC16544l.m18094g(configuration, "configuration");
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.mo18116b(configuration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<ValueParameterDescriptor> valueParameters = functionInvokeDescriptor.getValueParameters();
        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type) != null) {
                List<ValueParameterDescriptor> valueParameters2 = functionInvokeDescriptor.getValueParameters();
                AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
                List<ValueParameterDescriptor> list2 = valueParameters2;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    AbstractC16544l.m18093f(type2, "getType(...)");
                    arrayList.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2));
                }
                int size = functionInvokeDescriptor.getValueParameters().size() - arrayList.size();
                boolean z6 = true;
                if (size == 0) {
                    List<ValueParameterDescriptor> valueParameters3 = functionInvokeDescriptor.getValueParameters();
                    AbstractC16544l.m18093f(valueParameters3, "getValueParameters(...)");
                    ArrayList<C17309l> arrayListM19334J0 = AbstractC17680n.m19334J0(arrayList, valueParameters3);
                    if (arrayListM19334J0.isEmpty()) {
                        return functionInvokeDescriptor;
                    }
                    for (C17309l c17309l : arrayListM19334J0) {
                        if (!AbstractC16544l.m18089b((Name) c17309l.f55136Y, ((ValueParameterDescriptor) c17309l.f55137Z).getName())) {
                        }
                    }
                    return functionInvokeDescriptor;
                }
                List<ValueParameterDescriptor> valueParameters4 = functionInvokeDescriptor.getValueParameters();
                AbstractC16544l.m18093f(valueParameters4, "getValueParameters(...)");
                List<ValueParameterDescriptor> list3 = valueParameters4;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                for (ValueParameterDescriptor valueParameterDescriptor : list3) {
                    Name name2 = valueParameterDescriptor.getName();
                    AbstractC16544l.m18093f(name2, "getName(...)");
                    int index = valueParameterDescriptor.getIndex();
                    int i10 = index - size;
                    if (i10 >= 0 && (name = (Name) arrayList.get(i10)) != null) {
                        name2 = name;
                    }
                    arrayList2.add(valueParameterDescriptor.copy(functionInvokeDescriptor, name2, index));
                }
                FunctionDescriptorImpl.CopyConfiguration copyConfigurationM18143c = functionInvokeDescriptor.m18143c(TypeSubstitutor.EMPTY);
                if (arrayList.isEmpty()) {
                    z6 = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((Name) it3.next()) == null) {
                        }
                    }
                    z6 = false;
                }
                FunctionDescriptorImpl.CopyConfiguration original = copyConfigurationM18143c.setHasSynthesizedParameterNames(z6).setValueParameters((List<ValueParameterDescriptor>) arrayList2).setOriginal((CallableMemberDescriptor) functionInvokeDescriptor.getOriginal());
                AbstractC16544l.m18093f(original, "setOriginal(...)");
                FunctionDescriptorImpl functionDescriptorImplMo18116b = super.mo18116b(original);
                AbstractC16544l.m18091d(functionDescriptorImplMo18116b);
                return functionDescriptorImplMo18116b;
            }
        }
        return functionInvokeDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        AbstractC16544l.m18094g(newOwner, "newOwner");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(annotations, "annotations");
        return new FunctionInvokeDescriptor(newOwner, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z6) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.getEMPTY(), OperatorNameConventions.INVOKE, kind, SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z6);
        setHasStableParameterNames(false);
    }
}
