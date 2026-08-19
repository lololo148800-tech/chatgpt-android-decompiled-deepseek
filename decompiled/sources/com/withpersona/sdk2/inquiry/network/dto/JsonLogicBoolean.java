package com.withpersona.sdk2.inquiry.network.dto;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import bj.InterfaceC11468o;
import bj.InterfaceC11472s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import mm.C17312o;
import mm.InterfaceC17306i;
import p000.C18254p;
import p000.C20691w;
import p000.C21348y;
import p000.InterfaceC20083u;
import p025An.C0644w;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = false)
@Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR#\u0010(\u001a\u0004\u0018\u00010!8BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006*"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "Landroid/os/Parcelable;", "", "rule", "<init>", "(Ljava/lang/String;)V", "", "", "formValues", "thisComponentValue", "", "getValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Boolean;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRule", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "parsedRules$delegate", "Lmm/i;", "getParsedRules", "()Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "getParsedRules$annotations", "()V", "parsedRules", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class JsonLogicBoolean implements Parcelable {

    /* JADX INFO: renamed from: parsedRules$delegate, reason: from kotlin metadata */
    private final InterfaceC17306i parsedRules = AbstractC9227W.m9800c(new JsonLogicBoolean$parsedRules$2(this));
    private final String rule;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<JsonLogicBoolean> CREATOR = new Creator();

    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion extends AbstractC11471r {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // bj.AbstractC11471r
        @InterfaceC11453S
        public void toJson(AbstractC11440E writer, JsonLogicBoolean value) {
        }

        private Companion() {
        }

        @Override // bj.AbstractC11471r
        @InterfaceC11467n
        public JsonLogicBoolean fromJson(AbstractC11477x reader) {
            return new JsonLogicBoolean(reader.mo12804P().mo1357i0().m1452r());
        }
    }

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<JsonLogicBoolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean createFromParcel(Parcel parcel) {
            return new JsonLogicBoolean(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean[] newArray(int i10) {
            return new JsonLogicBoolean[i10];
        }
    }

    public JsonLogicBoolean(String str) {
        this.rule = str;
    }

    public static /* synthetic */ JsonLogicBoolean copy$default(JsonLogicBoolean jsonLogicBoolean, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jsonLogicBoolean.rule;
        }
        return jsonLogicBoolean.copy(str);
    }

    private final ParsedRules getParsedRules() {
        return (ParsedRules) this.parsedRules.getValue();
    }

    @InterfaceC11468o(ignore = true)
    private static /* synthetic */ void getParsedRules$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRule() {
        return this.rule;
    }

    public final JsonLogicBoolean copy(String rule) {
        return new JsonLogicBoolean(rule);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JsonLogicBoolean) && AbstractC16544l.m18089b(this.rule, ((JsonLogicBoolean) other).rule);
    }

    public final String getRule() {
        return this.rule;
    }

    public final Boolean getValue(Map<String, ? extends Object> formValues, Object thisComponentValue) {
        Object objM9806b;
        Object c21348y;
        ParsedRules parsedRules = getParsedRules();
        if (parsedRules == null) {
            return null;
        }
        if (!(parsedRules instanceof ParsedRules.ComplexRules)) {
            if (!(parsedRules instanceof ParsedRules.PrimitiveRule)) {
                throw new C0644w();
            }
            ParsedRules.PrimitiveRule primitiveRule = (ParsedRules.PrimitiveRule) parsedRules;
            if (primitiveRule.getValue() instanceof Boolean) {
                return (Boolean) primitiveRule.getValue();
            }
            return null;
        }
        InterfaceC20083u jsonLogicEngine = JsonLogicBooleanKt.getJsonLogicEngine();
        Map<String, Object> expression = ((ParsedRules.ComplexRules) parsedRules).getExpression();
        Map mapM19244f = AbstractC17659D.m19244f(new C17309l("form", formValues), new C17309l("value", thisComponentValue));
        C18254p c18254p = (C18254p) jsonLogicEngine;
        c18254p.getClass();
        AbstractC16544l.m18094g(expression, "expression");
        Map<String, Object> map = !expression.isEmpty() ? expression : null;
        C20691w c20691w = C20691w.f65547a;
        C20691w c20691w2 = C20691w.f65548b;
        C20691w c20691w3 = C20691w.f65549c;
        if (map != null) {
            try {
                objM9806b = c18254p.f58143a.m6216b(expression, mapM19244f);
            } catch (Throwable th2) {
                objM9806b = AbstractC9233X.m9806b(th2);
            }
            if (C17312o.m18979a(objM9806b) != null) {
                c21348y = c20691w2;
            } else if (objM9806b != null) {
                if (objM9806b instanceof Double) {
                    Number number = (Number) objM9806b;
                    double dDoubleValue = number.doubleValue() % 1.0d;
                    if (dDoubleValue != 0.0d && Math.signum(dDoubleValue) != Math.signum(1.0d)) {
                        dDoubleValue += 1.0d;
                    }
                    if (dDoubleValue == 0.0d) {
                        objM9806b = Long.valueOf((long) number.doubleValue());
                    }
                }
                c21348y = new C21348y(objM9806b);
            } else {
                c21348y = c20691w3;
            }
        } else {
            c21348y = c20691w;
        }
        if (c21348y instanceof C21348y) {
            Object obj = ((C21348y) c21348y).f67812a;
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            return null;
        }
        if (c21348y.equals(c20691w3) || c21348y.equals(c20691w) || c21348y.equals(c20691w2)) {
            return null;
        }
        throw new C0644w();
    }

    public int hashCode() {
        return this.rule.hashCode();
    }

    public String toString() {
        return AbstractC10763a.m11054l("JsonLogicBoolean(rule=", this.rule, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.rule);
    }
}
