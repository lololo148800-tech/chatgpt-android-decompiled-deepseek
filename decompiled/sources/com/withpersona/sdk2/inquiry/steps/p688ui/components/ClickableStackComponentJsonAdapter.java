package com.withpersona.sdk2.inquiry.steps.p688ui.components;

import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p909nm.C17691y;
import p994rk.InterfaceC19201o2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponentJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ClickableStackComponentJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40901a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40902b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f40903c;

    /* JADX INFO: renamed from: d */
    public final AbstractC11471r f40904d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor f40905e;

    public ClickableStackComponentJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40901a = C11475v.m12866a("config", "children", "isActive");
        C17691y c17691y = C17691y.f56482Y;
        this.f40902b = moshi.m12850b(UiComponentConfig.ClickableStack.class, c17691y, "config");
        this.f40903c = moshi.m12850b(AbstractC11452Q.m12856f(List.class, InterfaceC19201o2.class), c17691y, "children");
        this.f40904d = moshi.m12850b(Boolean.TYPE, c17691y, "isActive");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC16544l.m18094g(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.mo12814e();
        UiComponentConfig.ClickableStack clickableStack = null;
        List list = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f40901a);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                clickableStack = (UiComponentConfig.ClickableStack) this.f40902b.fromJson(reader);
                if (clickableStack == null) {
                    throw AbstractC13178c.m14838l("config", "config", reader);
                }
            } else if (iMo12819v0 == 1) {
                list = (List) this.f40903c.fromJson(reader);
                if (list == null) {
                    throw AbstractC13178c.m14838l("children", "children", reader);
                }
                i10 &= -3;
            } else if (iMo12819v0 == 2) {
                bool = (Boolean) this.f40904d.fromJson(reader);
                if (bool == null) {
                    throw AbstractC13178c.m14838l("isActive", "isActive", reader);
                }
                i10 &= -5;
            } else {
                continue;
            }
        }
        reader.mo12818m();
        if (i10 == -7) {
            if (clickableStack == null) {
                throw AbstractC13178c.m14832f("config", "config", reader);
            }
            AbstractC16544l.m18092e(list, "null cannot be cast to non-null type kotlin.collections.List<com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent>");
            return new ClickableStackComponent(clickableStack, list, bool.booleanValue());
        }
        Constructor declaredConstructor = this.f40905e;
        if (declaredConstructor == null) {
            declaredConstructor = ClickableStackComponent.class.getDeclaredConstructor(UiComponentConfig.ClickableStack.class, List.class, Boolean.TYPE, Integer.TYPE, AbstractC13178c.f41822c);
            this.f40905e = declaredConstructor;
            AbstractC16544l.m18093f(declaredConstructor, "also(...)");
        }
        if (clickableStack == null) {
            throw AbstractC13178c.m14832f("config", "config", reader);
        }
        Object objNewInstance = declaredConstructor.newInstance(clickableStack, list, bool, Integer.valueOf(i10), null);
        AbstractC16544l.m18093f(objNewInstance, "newInstance(...)");
        return (ClickableStackComponent) objNewInstance;
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        ClickableStackComponent clickableStackComponent = (ClickableStackComponent) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (clickableStackComponent == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("config");
        this.f40902b.toJson(writer, clickableStackComponent.f40897Y);
        writer.mo12827T("children");
        this.f40903c.toJson(writer, clickableStackComponent.f40898Z);
        writer.mo12827T("isActive");
        this.f40904d.toJson(writer, Boolean.valueOf(clickableStackComponent.f40899o0));
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(45, "GeneratedJsonAdapter(ClickableStackComponent)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
