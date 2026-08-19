package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p436Rm.C6941g;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {

    /* JADX INFO: renamed from: A0 */
    public boolean f51502A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f51503B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f51504C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f51505D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f51506E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f51507F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f51508G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f51509H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f51510I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f51511J0;

    /* JADX INFO: renamed from: K0 */
    public Collection f51512K0;

    /* JADX INFO: renamed from: L0 */
    public volatile C16562a f51513L0;

    /* JADX INFO: renamed from: M0 */
    public final FunctionDescriptor f51514M0;

    /* JADX INFO: renamed from: N0 */
    public final CallableMemberDescriptor.Kind f51515N0;

    /* JADX INFO: renamed from: O0 */
    public FunctionDescriptor f51516O0;

    /* JADX INFO: renamed from: P0 */
    public Map f51517P0;

    /* JADX INFO: renamed from: q0 */
    public List f51518q0;

    /* JADX INFO: renamed from: r0 */
    public List f51519r0;

    /* JADX INFO: renamed from: s0 */
    public KotlinType f51520s0;

    /* JADX INFO: renamed from: t0 */
    public List f51521t0;

    /* JADX INFO: renamed from: u0 */
    public ReceiverParameterDescriptor f51522u0;

    /* JADX INFO: renamed from: v0 */
    public ReceiverParameterDescriptor f51523v0;

    /* JADX INFO: renamed from: w0 */
    public Modality f51524w0;

    /* JADX INFO: renamed from: x0 */
    public DescriptorVisibility f51525x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f51526y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f51527z0;

    public class CopyConfiguration implements FunctionDescriptor.CopyBuilder<FunctionDescriptor> {

        /* JADX INFO: renamed from: a */
        public TypeSubstitution f51528a;

        /* JADX INFO: renamed from: b */
        public DeclarationDescriptor f51529b;

        /* JADX INFO: renamed from: c */
        public Modality f51530c;

        /* JADX INFO: renamed from: d */
        public DescriptorVisibility f51531d;

        /* JADX INFO: renamed from: e */
        public FunctionDescriptor f51532e;

        /* JADX INFO: renamed from: f */
        public CallableMemberDescriptor.Kind f51533f;

        /* JADX INFO: renamed from: g */
        public List f51534g;

        /* JADX INFO: renamed from: h */
        public final List f51535h;

        /* JADX INFO: renamed from: i */
        public ReceiverParameterDescriptor f51536i;

        /* JADX INFO: renamed from: j */
        public ReceiverParameterDescriptor f51537j;

        /* JADX INFO: renamed from: k */
        public KotlinType f51538k;

        /* JADX INFO: renamed from: l */
        public Name f51539l;

        /* JADX INFO: renamed from: m */
        public boolean f51540m;

        /* JADX INFO: renamed from: n */
        public boolean f51541n;

        /* JADX INFO: renamed from: o */
        public boolean f51542o;

        /* JADX INFO: renamed from: p */
        public boolean f51543p;

        /* JADX INFO: renamed from: q */
        public boolean f51544q;

        /* JADX INFO: renamed from: r */
        public List f51545r;

        /* JADX INFO: renamed from: s */
        public Annotations f51546s;

        /* JADX INFO: renamed from: t */
        public boolean f51547t;

        /* JADX INFO: renamed from: u */
        public final LinkedHashMap f51548u;

        /* JADX INFO: renamed from: v */
        public Boolean f51549v;

        /* JADX INFO: renamed from: w */
        public boolean f51550w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ FunctionDescriptorImpl f51551x;

        public CopyConfiguration(FunctionDescriptorImpl functionDescriptorImpl, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, List<ValueParameterDescriptor> list, List<ReceiverParameterDescriptor> list2, ReceiverParameterDescriptor receiverParameterDescriptor, KotlinType kotlinType, Name name) {
            if (typeSubstitution == null) {
                m18144a(0);
                throw null;
            }
            if (declarationDescriptor == null) {
                m18144a(1);
                throw null;
            }
            if (modality == null) {
                m18144a(2);
                throw null;
            }
            if (descriptorVisibility == null) {
                m18144a(3);
                throw null;
            }
            if (kind == null) {
                m18144a(4);
                throw null;
            }
            if (list == null) {
                m18144a(5);
                throw null;
            }
            if (list2 == null) {
                m18144a(6);
                throw null;
            }
            if (kotlinType == null) {
                m18144a(7);
                throw null;
            }
            this.f51551x = functionDescriptorImpl;
            this.f51532e = null;
            this.f51537j = functionDescriptorImpl.f51523v0;
            this.f51540m = true;
            this.f51541n = false;
            this.f51542o = false;
            this.f51543p = false;
            this.f51544q = functionDescriptorImpl.isHiddenToOvercomeSignatureClash();
            this.f51545r = null;
            this.f51546s = null;
            this.f51547t = functionDescriptorImpl.isHiddenForResolutionEverywhereBesideSupercalls();
            this.f51548u = new LinkedHashMap();
            this.f51549v = null;
            this.f51550w = false;
            this.f51528a = typeSubstitution;
            this.f51529b = declarationDescriptor;
            this.f51530c = modality;
            this.f51531d = descriptorVisibility;
            this.f51533f = kind;
            this.f51534g = list;
            this.f51535h = list2;
            this.f51536i = receiverParameterDescriptor;
            this.f51538k = kotlinType;
            this.f51539l = name;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m18144a(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = DiagnosticsEntry.NAME_KEY;
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor build() {
            return this.f51551x.mo18116b(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public <V> FunctionDescriptor.CopyBuilder<FunctionDescriptor> putUserData(CallableDescriptor.UserDataKey<V> userDataKey, V v2) {
            if (userDataKey != null) {
                this.f51548u.put(userDataKey, v2);
                return this;
            }
            m18144a(39);
            throw null;
        }

        public CopyConfiguration setHasSynthesizedParameterNames(boolean z6) {
            this.f51549v = Boolean.valueOf(z6);
            return this;
        }

        public CopyConfiguration setJustForTypeSubstitution(boolean z6) {
            this.f51550w = z6;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public /* bridge */ /* synthetic */ FunctionDescriptor.CopyBuilder setTypeParameters(List list) {
            return setTypeParameters((List<TypeParameterDescriptor>) list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public /* bridge */ /* synthetic */ FunctionDescriptor.CopyBuilder setValueParameters(List list) {
            return setValueParameters((List<ValueParameterDescriptor>) list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setAdditionalAnnotations(Annotations annotations) {
            if (annotations != null) {
                this.f51546s = annotations;
                return this;
            }
            m18144a(35);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setCopyOverrides(boolean z6) {
            this.f51540m = z6;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setDispatchReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.f51537j = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setDropOriginalInContainingParts() {
            this.f51543p = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setExtensionReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.f51536i = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setHiddenForResolutionEverywhereBesideSupercalls() {
            this.f51547t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setHiddenToOvercomeSignatureClash() {
            this.f51544q = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setKind(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.f51533f = kind;
                return this;
            }
            m18144a(14);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setModality(Modality modality) {
            if (modality != null) {
                this.f51530c = modality;
                return this;
            }
            m18144a(10);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setName(Name name) {
            if (name != null) {
                this.f51539l = name;
                return this;
            }
            m18144a(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setOriginal(CallableMemberDescriptor callableMemberDescriptor) {
            this.f51532e = (FunctionDescriptor) callableMemberDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setOwner(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                this.f51529b = declarationDescriptor;
                return this;
            }
            m18144a(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setPreserveSourceElement() {
            this.f51542o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setReturnType(KotlinType kotlinType) {
            if (kotlinType != null) {
                this.f51538k = kotlinType;
                return this;
            }
            m18144a(23);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setSignatureChange() {
            this.f51541n = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setSubstitution(TypeSubstitution typeSubstitution) {
            if (typeSubstitution != null) {
                this.f51528a = typeSubstitution;
                return this;
            }
            m18144a(37);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setTypeParameters(List<TypeParameterDescriptor> list) {
            if (list != null) {
                this.f51545r = list;
                return this;
            }
            m18144a(21);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setValueParameters(List<ValueParameterDescriptor> list) {
            if (list != null) {
                this.f51534g = list;
                return this;
            }
            m18144a(19);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public CopyConfiguration setVisibility(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility != null) {
                this.f51531d = descriptorVisibility;
                return this;
            }
            m18144a(12);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionDescriptorImpl(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (declarationDescriptor == null) {
            m18142a(0);
            throw null;
        }
        if (annotations == null) {
            m18142a(1);
            throw null;
        }
        if (name == null) {
            m18142a(2);
            throw null;
        }
        if (kind == null) {
            m18142a(3);
            throw null;
        }
        if (sourceElement == null) {
            m18142a(4);
            throw null;
        }
        this.f51525x0 = DescriptorVisibilities.UNKNOWN;
        this.f51526y0 = false;
        this.f51527z0 = false;
        this.f51502A0 = false;
        this.f51503B0 = false;
        this.f51504C0 = false;
        this.f51505D0 = false;
        this.f51506E0 = false;
        this.f51507F0 = false;
        this.f51508G0 = false;
        this.f51509H0 = false;
        this.f51510I0 = true;
        this.f51511J0 = false;
        this.f51512K0 = null;
        this.f51513L0 = null;
        this.f51516O0 = null;
        this.f51517P0 = null;
        this.f51514M0 = functionDescriptor == null ? this : functionDescriptor;
        this.f51515N0 = kind;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18142a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static List<ValueParameterDescriptor> getSubstitutedValueParameters(FunctionDescriptor functionDescriptor, List<ValueParameterDescriptor> list, TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            m18142a(28);
            throw null;
        }
        if (typeSubstitutor != null) {
            return getSubstitutedValueParameters(functionDescriptor, list, typeSubstitutor, false, false, null);
        }
        m18142a(29);
        throw null;
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.visitFunctionDescriptor(this, d10);
    }

    /* JADX INFO: renamed from: b */
    public FunctionDescriptorImpl mo18116b(CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        KotlinType kotlinTypeSubstitute;
        if (copyConfiguration == null) {
            m18142a(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        Annotations annotationsComposeAnnotations = copyConfiguration.f51546s != null ? AnnotationsKt.composeAnnotations(getAnnotations(), copyConfiguration.f51546s) : getAnnotations();
        DeclarationDescriptor declarationDescriptor = copyConfiguration.f51529b;
        FunctionDescriptor functionDescriptor = copyConfiguration.f51532e;
        CallableMemberDescriptor.Kind kind = copyConfiguration.f51533f;
        Name name = copyConfiguration.f51539l;
        SourceElement source = copyConfiguration.f51542o ? (functionDescriptor != null ? functionDescriptor : getOriginal()).getSource() : SourceElement.NO_SOURCE;
        if (source == null) {
            m18142a(27);
            throw null;
        }
        FunctionDescriptorImpl functionDescriptorImplCreateSubstitutedCopy = createSubstitutedCopy(declarationDescriptor, functionDescriptor, kind, name, annotationsComposeAnnotations, source);
        List<TypeParameterDescriptor> typeParameters = copyConfiguration.f51545r;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorSubstituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters, copyConfiguration.f51528a, functionDescriptorImplCreateSubstitutedCopy, arrayList, zArr);
        if (typeSubstitutorSubstituteTypeParameters == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!copyConfiguration.f51535h.isEmpty()) {
            int i10 = 0;
            for (ReceiverParameterDescriptor receiverParameterDescriptor2 : copyConfiguration.f51535h) {
                KotlinType kotlinTypeSubstitute2 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor2.getType(), Variance.IN_VARIANCE);
                if (kotlinTypeSubstitute2 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(DescriptorFactory.createContextReceiverParameterForCallable(functionDescriptorImplCreateSubstitutedCopy, kotlinTypeSubstitute2, ((ImplicitContextReceiver) receiverParameterDescriptor2.getValue()).getCustomLabelName(), receiverParameterDescriptor2.getAnnotations(), i10));
                zArr[0] = zArr[0] | (kotlinTypeSubstitute2 != receiverParameterDescriptor2.getType());
                i10 = i11;
            }
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = copyConfiguration.f51536i;
        if (receiverParameterDescriptor3 != null) {
            KotlinType kotlinTypeSubstitute3 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor3.getType(), Variance.IN_VARIANCE);
            if (kotlinTypeSubstitute3 == null) {
                return null;
            }
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2 = new ReceiverParameterDescriptorImpl(functionDescriptorImplCreateSubstitutedCopy, new ExtensionReceiver(functionDescriptorImplCreateSubstitutedCopy, kotlinTypeSubstitute3, copyConfiguration.f51536i.getValue()), copyConfiguration.f51536i.getAnnotations());
            zArr[0] = (kotlinTypeSubstitute3 != copyConfiguration.f51536i.getType()) | zArr[0];
            receiverParameterDescriptorImpl = receiverParameterDescriptorImpl2;
        } else {
            receiverParameterDescriptorImpl = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor4 = copyConfiguration.f51537j;
        if (receiverParameterDescriptor4 != null) {
            ReceiverParameterDescriptor receiverParameterDescriptorSubstitute = receiverParameterDescriptor4.substitute(typeSubstitutorSubstituteTypeParameters);
            if (receiverParameterDescriptorSubstitute == null) {
                return null;
            }
            zArr[0] = zArr[0] | (receiverParameterDescriptorSubstitute != copyConfiguration.f51537j);
            receiverParameterDescriptor = receiverParameterDescriptorSubstitute;
        } else {
            receiverParameterDescriptor = null;
        }
        List<ValueParameterDescriptor> substitutedValueParameters = getSubstitutedValueParameters(functionDescriptorImplCreateSubstitutedCopy, copyConfiguration.f51534g, typeSubstitutorSubstituteTypeParameters, copyConfiguration.f51543p, copyConfiguration.f51542o, zArr);
        if (substitutedValueParameters == null || (kotlinTypeSubstitute = typeSubstitutorSubstituteTypeParameters.substitute(copyConfiguration.f51538k, Variance.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z6 = zArr[0] | (kotlinTypeSubstitute != copyConfiguration.f51538k);
        zArr[0] = z6;
        if (!z6 && copyConfiguration.f51550w) {
            return this;
        }
        functionDescriptorImplCreateSubstitutedCopy.initialize(receiverParameterDescriptorImpl, receiverParameterDescriptor, arrayList2, arrayList, substitutedValueParameters, kotlinTypeSubstitute, copyConfiguration.f51530c, copyConfiguration.f51531d);
        functionDescriptorImplCreateSubstitutedCopy.setOperator(this.f51526y0);
        functionDescriptorImplCreateSubstitutedCopy.setInfix(this.f51527z0);
        functionDescriptorImplCreateSubstitutedCopy.setExternal(this.f51502A0);
        functionDescriptorImplCreateSubstitutedCopy.setInline(this.f51503B0);
        functionDescriptorImplCreateSubstitutedCopy.setTailrec(this.f51504C0);
        functionDescriptorImplCreateSubstitutedCopy.setSuspend(this.f51509H0);
        functionDescriptorImplCreateSubstitutedCopy.setExpect(this.f51505D0);
        functionDescriptorImplCreateSubstitutedCopy.setActual(this.f51506E0);
        functionDescriptorImplCreateSubstitutedCopy.setHasStableParameterNames(this.f51510I0);
        functionDescriptorImplCreateSubstitutedCopy.f51507F0 = copyConfiguration.f51544q;
        functionDescriptorImplCreateSubstitutedCopy.f51508G0 = copyConfiguration.f51547t;
        Boolean bool = copyConfiguration.f51549v;
        functionDescriptorImplCreateSubstitutedCopy.setHasSynthesizedParameterNames(bool != null ? bool.booleanValue() : this.f51511J0);
        if (!copyConfiguration.f51548u.isEmpty() || this.f51517P0 != null) {
            LinkedHashMap linkedHashMap = copyConfiguration.f51548u;
            Map map = this.f51517P0;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!linkedHashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (linkedHashMap.size() == 1) {
                functionDescriptorImplCreateSubstitutedCopy.f51517P0 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                functionDescriptorImplCreateSubstitutedCopy.f51517P0 = linkedHashMap;
            }
        }
        if (copyConfiguration.f51541n || getInitialSignatureDescriptor() != null) {
            functionDescriptorImplCreateSubstitutedCopy.f51516O0 = (getInitialSignatureDescriptor() != null ? getInitialSignatureDescriptor() : this).substitute(typeSubstitutorSubstituteTypeParameters);
        }
        if (copyConfiguration.f51540m && !getOriginal().getOverriddenDescriptors().isEmpty()) {
            if (copyConfiguration.f51528a.isEmpty()) {
                C16562a c16562a = this.f51513L0;
                if (c16562a != null) {
                    functionDescriptorImplCreateSubstitutedCopy.f51513L0 = c16562a;
                } else {
                    functionDescriptorImplCreateSubstitutedCopy.setOverriddenDescriptors(getOverriddenDescriptors());
                }
            } else {
                functionDescriptorImplCreateSubstitutedCopy.f51513L0 = new C16562a(this, typeSubstitutorSubstituteTypeParameters);
            }
        }
        return functionDescriptorImplCreateSubstitutedCopy;
    }

    /* JADX INFO: renamed from: c */
    public final CopyConfiguration m18143c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return new CopyConfiguration(this, typeSubstitutor.getSubstitution(), getContainingDeclaration(), getModality(), getVisibility(), getKind(), getValueParameters(), getContextReceiverParameters(), getExtensionReceiverParameter(), getReturnType(), null);
        }
        m18142a(24);
        throw null;
    }

    public abstract FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> list = this.f51521t0;
        if (list != null) {
            return list;
        }
        m18142a(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.f51523v0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.f51522u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor getInitialSignatureDescriptor() {
        return this.f51516O0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f51515N0;
        if (kind != null) {
            return kind;
        }
        m18142a(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = this.f51524w0;
        if (modality != null) {
            return modality;
        }
        m18142a(15);
        throw null;
    }

    public Collection<? extends FunctionDescriptor> getOverriddenDescriptors() {
        C16562a c16562a = this.f51513L0;
        if (c16562a != null) {
            this.f51512K0 = (Collection) c16562a.invoke();
            this.f51513L0 = null;
        }
        Collection<? extends FunctionDescriptor> collectionEmptyList = this.f51512K0;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        m18142a(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.f51520s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.f51518q0;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        Map map = this.f51517P0;
        if (map == null) {
            return null;
        }
        return (V) map.get(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ValueParameterDescriptor> getValueParameters() {
        List<ValueParameterDescriptor> list = this.f51519r0;
        if (list != null) {
            return list;
        }
        m18142a(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f51525x0;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        m18142a(16);
        throw null;
    }

    public boolean hasStableParameterNames() {
        return this.f51510I0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.f51511J0;
    }

    public FunctionDescriptorImpl initialize(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            m18142a(5);
            throw null;
        }
        if (list2 == null) {
            m18142a(6);
            throw null;
        }
        if (list3 == null) {
            m18142a(7);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18142a(8);
            throw null;
        }
        this.f51518q0 = AbstractC17680n.m19322C0(list2);
        this.f51519r0 = AbstractC17680n.m19322C0(list3);
        this.f51520s0 = kotlinType;
        this.f51524w0 = modality;
        this.f51525x0 = descriptorVisibility;
        this.f51522u0 = receiverParameterDescriptor;
        this.f51523v0 = receiverParameterDescriptor2;
        this.f51521t0 = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            TypeParameterDescriptor typeParameterDescriptor = list2.get(i10);
            if (typeParameterDescriptor.getIndex() != i10) {
                throw new IllegalStateException(typeParameterDescriptor + " index is " + typeParameterDescriptor.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            ValueParameterDescriptor valueParameterDescriptor = list3.get(i11);
            if (valueParameterDescriptor.getIndex() != i11) {
                throw new IllegalStateException(valueParameterDescriptor + "index is " + valueParameterDescriptor.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.f51506E0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.f51505D0;
    }

    public boolean isExternal() {
        return this.f51502A0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.f51508G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenToOvercomeSignatureClash() {
        return this.f51507F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        if (this.f51527z0) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f51503B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        if (this.f51526y0) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return this.f51509H0;
    }

    public boolean isTailrec() {
        return this.f51504C0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> newCopyBuilder() {
        return m18143c(TypeSubstitutor.EMPTY);
    }

    public <V> void putInUserDataMap(CallableDescriptor.UserDataKey<V> userDataKey, Object obj) {
        if (this.f51517P0 == null) {
            this.f51517P0 = new LinkedHashMap();
        }
        this.f51517P0.put(userDataKey, obj);
    }

    public void setActual(boolean z6) {
        this.f51506E0 = z6;
    }

    public void setExpect(boolean z6) {
        this.f51505D0 = z6;
    }

    public void setExternal(boolean z6) {
        this.f51502A0 = z6;
    }

    public void setHasStableParameterNames(boolean z6) {
        this.f51510I0 = z6;
    }

    public void setHasSynthesizedParameterNames(boolean z6) {
        this.f51511J0 = z6;
    }

    public void setInfix(boolean z6) {
        this.f51527z0 = z6;
    }

    public void setInline(boolean z6) {
        this.f51503B0 = z6;
    }

    public void setOperator(boolean z6) {
        this.f51526y0 = z6;
    }

    public void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m18142a(17);
            throw null;
        }
        this.f51512K0 = collection;
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            if (((FunctionDescriptor) it.next()).isHiddenForResolutionEverywhereBesideSupercalls()) {
                this.f51508G0 = true;
                return;
            }
        }
    }

    public void setReturnType(KotlinType kotlinType) {
        if (kotlinType != null) {
            this.f51520s0 = kotlinType;
        } else {
            m18142a(11);
            throw null;
        }
    }

    public void setSuspend(boolean z6) {
        this.f51509H0 = z6;
    }

    public void setTailrec(boolean z6) {
        this.f51504C0 = z6;
    }

    public void setVisibility(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            this.f51525x0 = descriptorVisibility;
        } else {
            m18142a(10);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z6) {
        FunctionDescriptor functionDescriptorBuild = newCopyBuilder().setOwner(declarationDescriptor).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z6).build();
        if (functionDescriptorBuild != null) {
            return functionDescriptorBuild;
        }
        m18142a(26);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public FunctionDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : m18143c(typeSubstitutor).setOriginal((CallableMemberDescriptor) getOriginal()).setPreserveSourceElement().setJustForTypeSubstitution(true).build();
        }
        m18142a(22);
        throw null;
    }

    public static List<ValueParameterDescriptor> getSubstitutedValueParameters(FunctionDescriptor functionDescriptor, List<ValueParameterDescriptor> list, TypeSubstitutor typeSubstitutor, boolean z6, boolean z10, boolean[] zArr) {
        if (list == null) {
            m18142a(30);
            throw null;
        }
        if (typeSubstitutor != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (ValueParameterDescriptor valueParameterDescriptor : list) {
                KotlinType type = valueParameterDescriptor.getType();
                Variance variance = Variance.IN_VARIANCE;
                KotlinType kotlinTypeSubstitute = typeSubstitutor.substitute(type, variance);
                KotlinType varargElementType = valueParameterDescriptor.getVarargElementType();
                KotlinType kotlinTypeSubstitute2 = varargElementType == null ? null : typeSubstitutor.substitute(varargElementType, variance);
                if (kotlinTypeSubstitute == null) {
                    return null;
                }
                if ((kotlinTypeSubstitute != valueParameterDescriptor.getType() || varargElementType != kotlinTypeSubstitute2) && zArr != null) {
                    zArr[0] = true;
                }
                arrayList.add(ValueParameterDescriptorImpl.createWithDestructuringDeclarations(functionDescriptor, z6 ? null : valueParameterDescriptor, valueParameterDescriptor.getIndex(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), kotlinTypeSubstitute, valueParameterDescriptor.declaresDefaultValue(), valueParameterDescriptor.isCrossinline(), valueParameterDescriptor.isNoinline(), kotlinTypeSubstitute2, z10 ? valueParameterDescriptor.getSource() : SourceElement.NO_SOURCE, valueParameterDescriptor instanceof ValueParameterDescriptorImpl.WithDestructuringDeclaration ? new C6941g(0, ((ValueParameterDescriptorImpl.WithDestructuringDeclaration) valueParameterDescriptor).getDestructuringVariables()) : null));
            }
            return arrayList;
        }
        m18142a(31);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public FunctionDescriptor getOriginal() {
        FunctionDescriptor functionDescriptor = this.f51514M0;
        FunctionDescriptor original = functionDescriptor == this ? this : functionDescriptor.getOriginal();
        if (original != null) {
            return original;
        }
        m18142a(20);
        throw null;
    }
}
