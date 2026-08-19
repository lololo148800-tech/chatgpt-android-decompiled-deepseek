package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p049Bm.InterfaceC1436k;
import p1047un.C20392a;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
public final class OperatorChecks extends AbstractModifierChecks {
    public static final OperatorChecks INSTANCE = new OperatorChecks();

    /* JADX INFO: renamed from: a */
    public static final List f53297a;

    static {
        Name name = OperatorNameConventions.GET;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.INSTANCE;
        Checks checks = new Checks(name, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(1)}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null);
        Checks checks2 = new Checks(OperatorNameConventions.SET, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(2)}, C20392a.f64493q0);
        Name name2 = OperatorNameConventions.GET_VALUE;
        C16640b c16640b = C16640b.f53308a;
        ValueParameterCountCheck.AtLeast atLeast = new ValueParameterCountCheck.AtLeast(2);
        C16639a c16639a = C16639a.f53307a;
        Checks checks3 = new Checks(name2, new Check[]{memberOrExtension, c16640b, atLeast, c16639a}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null);
        Checks checks4 = new Checks(OperatorNameConventions.SET_VALUE, new Check[]{memberOrExtension, c16640b, new ValueParameterCountCheck.AtLeast(3), c16639a}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null);
        Checks checks5 = new Checks(OperatorNameConventions.PROVIDE_DELEGATE, new Check[]{memberOrExtension, c16640b, new ValueParameterCountCheck.Equals(2), c16639a}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null);
        Checks checks6 = new Checks(OperatorNameConventions.INVOKE, new Check[]{memberOrExtension}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null);
        Name name3 = OperatorNameConventions.CONTAINS;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.INSTANCE;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.INSTANCE;
        Checks checks7 = new Checks(name3, new Check[]{memberOrExtension, singleValueParameter, c16640b, returnsBoolean}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null);
        Name name4 = OperatorNameConventions.ITERATOR;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.INSTANCE;
        f53297a = AbstractC17681o.m19382k(checks, checks2, checks3, checks4, checks5, checks6, checks7, new Checks(name4, new Check[]{memberOrExtension, noValueParameters}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.NEXT, new Check[]{memberOrExtension, noValueParameters}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.HAS_NEXT, new Check[]{memberOrExtension, noValueParameters, returnsBoolean}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_TO, new Check[]{memberOrExtension, singleValueParameter, c16640b}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_UNTIL, new Check[]{memberOrExtension, singleValueParameter, c16640b}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.EQUALS, new Check[]{MemberKindCheck.Member.INSTANCE}, C20392a.f64494r0), new Checks(OperatorNameConventions.COMPARE_TO, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.INSTANCE, singleValueParameter, c16640b}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.BINARY_OPERATION_NAMES, new Check[]{memberOrExtension, singleValueParameter, c16640b}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new Check[]{memberOrExtension, noValueParameters}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null), new Checks(AbstractC17681o.m19382k(OperatorNameConventions.INC, OperatorNameConventions.DEC), new Check[]{memberOrExtension}, C20392a.f64495s0), new Checks(OperatorNameConventions.ASSIGNMENT_OPERATIONS, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.INSTANCE, singleValueParameter, c16640b}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.COMPONENT_REGEX, new Check[]{memberOrExtension, noValueParameters}, (InterfaceC1436k) null, 4, (DefaultConstructorMarker) null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    public List<Checks> getChecks$descriptors() {
        return f53297a;
    }
}
