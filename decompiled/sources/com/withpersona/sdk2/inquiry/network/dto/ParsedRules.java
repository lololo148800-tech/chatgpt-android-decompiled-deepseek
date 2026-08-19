package com.withpersona.sdk2.inquiry.network.dto;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "", "()V", "ComplexRules", "PrimitiveRule", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$ComplexRules;", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
abstract class ParsedRules {

    @Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$ComplexRules;", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "expression", "", "", "", "(Ljava/util/Map;)V", "getExpression", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class ComplexRules extends ParsedRules {
        private final Map<String, Object> expression;

        public ComplexRules(Map<String, ? extends Object> map) {
            super(null);
            this.expression = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComplexRules copy$default(ComplexRules complexRules, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = complexRules.expression;
            }
            return complexRules.copy(map);
        }

        public final Map<String, Object> component1() {
            return this.expression;
        }

        public final ComplexRules copy(Map<String, ? extends Object> expression) {
            return new ComplexRules(expression);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ComplexRules) && AbstractC16544l.m18089b(this.expression, ((ComplexRules) other).expression);
        }

        public final Map<String, Object> getExpression() {
            return this.expression;
        }

        public int hashCode() {
            return this.expression.hashCode();
        }

        public String toString() {
            return "ComplexRules(expression=" + this.expression + Separators.RPAREN;
        }
    }

    @Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "value", "", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class PrimitiveRule extends ParsedRules {
        private final Object value;

        public PrimitiveRule(Object obj) {
            super(null);
            this.value = obj;
        }

        public static /* synthetic */ PrimitiveRule copy$default(PrimitiveRule primitiveRule, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = primitiveRule.value;
            }
            return primitiveRule.copy(obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public final PrimitiveRule copy(Object value) {
            return new PrimitiveRule(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PrimitiveRule) && AbstractC16544l.m18089b(this.value, ((PrimitiveRule) other).value);
        }

        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return AbstractC12107L1.m13824o(this.value, "PrimitiveRule(value=", Separators.RPAREN);
        }
    }

    public /* synthetic */ ParsedRules(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ParsedRules() {
    }
}
